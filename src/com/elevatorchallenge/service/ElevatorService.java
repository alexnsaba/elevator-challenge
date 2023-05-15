package com.elevatorchallenge.service;

import com.elevatorchallenge.dataloader.ElevatorPool;
import com.elevatorchallenge.entity.Elevator;
import com.elevatorchallenge.entity.Floor;
import com.elevatorchallenge.entity.Status;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class ElevatorService {
    // Get elevator pool
    private static final List<Elevator> elevators = ElevatorPool.createElevatorPool();

    private static final String elevatorFormatter = "| %-10s | %-15s | %-13s | %-13d | %-13d | %-12d |%n";

    public static void showAllElevatorStatus() {
        System.out.println();
        System.out.println("Status of all elevators");
        System.out.format("+------------+-----------------+---------------+---------------+---------------+--------------+%n");
        System.out.format("| Elevator # | Status          | Floor Name    | Floor Number  | People Inside | Weight Limit |%n");
        System.out.format("+------------+-----------------+---------------+---------------+---------------+--------------+%n");

        for (Elevator e : elevators) {
            System.out.format(elevatorFormatter, e.getId(), e.getStatus(), e.getCurrentFloor().getFloorName(),
                    e.getCurrentFloor().getFloorNumber(), e.getPeopleInside(), Elevator.WEIGHT_LIMIT);
        }

        System.out.format("+------------+-----------------+---------------+---------------+---------------+--------------+%n");
    }

    public static void showElevatorStatusById(int elevatorId) {

        Elevator elevator = elevators.stream().filter(e -> e.getId() == elevatorId).collect(Collectors.toList()).get(0);

        System.out.println();
        System.out.println("Status of Elevator # " + elevatorId);
        System.out.format("+------------+-----------------+---------------+---------------+---------------+--------------+%n");
        System.out.format("| Elevator # | Status          | Floor Name    | Floor Number  | People Inside | Weight Limit |%n");
        System.out.format("+------------+-----------------+---------------+---------------+---------------+--------------+%n");

        System.out.format(elevatorFormatter, elevator.getId(), elevator.getStatus(), elevator.getCurrentFloor().getFloorName(),
                elevator.getCurrentFloor().getFloorNumber(), elevator.getPeopleInside(), Elevator.WEIGHT_LIMIT);

        System.out.format("+------------+-----------------+---------------+---------------+---------------+--------------+%n");
    }

    public static void callElevatorToFloor(int floorNumber) {
        //Get elevator that is closest to the floor with the specified floor number
        Elevator closetElevator = getClosestElevator(floorNumber);

        //Update the elevator's current floor
        Floor floor = FloorService.getFloorByNumber(floorNumber);
        closetElevator.setCurrentFloor(floor);

        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.format(" Elevator # %d is coming to %s.......... %n", closetElevator.getId(), floor.getFloorName());

        //Stop the closest elevator at the floor
        closetElevator.setStatus(Status.STOPPING);
        System.out.format(" Elevator # %d is stopping on %s.......... %n", closetElevator.getId(), floor.getFloorName());

        //Open the elevators door
        closetElevator.setStatus(Status.DOOR_OPENING);
        System.out.format(" Elevator # %d is opening It's door on %s.......... %n", closetElevator.getId(), floor.getFloorName());
        System.out.println("-----------------------------------------------------------------------------------------------");
    }

    private static Elevator getClosestElevator(int closerTo) {
        //Extract list of current floor numbers from list of elevator
        List<Integer> currentFloorNumbers = ElevatorService.elevators.stream().map(e -> e.getCurrentFloor().getFloorNumber()).collect(Collectors.toList());

        //Get the closest floor number from a list of floor numbers
        int closest = currentFloorNumbers.stream().min(Comparator.comparingInt(i -> Math.abs(i - closerTo)))
                .orElseThrow(() -> new NoSuchElementException("No Elevator is close to floor " + closerTo));

        //Get the elevator that is at closet floor number

        return ElevatorService.elevators.stream().filter(e -> e.getCurrentFloor().getFloorNumber() == closest).collect(Collectors.toList()).get(0);
    }
}

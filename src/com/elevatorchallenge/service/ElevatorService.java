package com.elevatorchallenge.service;

import com.elevatorchallenge.dataloader.ElevatorPool;
import com.elevatorchallenge.entity.Elevator;

import java.util.List;
import java.util.stream.Collectors;

public class ElevatorService {
    // Get elevator pool
    private static final List<Elevator> elevators = ElevatorPool.createElevatorPool();

    private static final String elevatorFormatter = "| %-10s | %-15s | %-13s | %-13d | %-13d | %-12d |%n";

    public static void showAllElevatorStatus() {
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

        System.out.println("Status of Elevator # " + elevatorId);
        System.out.format("+------------+-----------------+---------------+---------------+---------------+--------------+%n");
        System.out.format("| Elevator # | Status          | Floor Name    | Floor Number  | People Inside | Weight Limit |%n");
        System.out.format("+------------+-----------------+---------------+---------------+---------------+--------------+%n");

        System.out.format(elevatorFormatter, elevator.getId(), elevator.getStatus(), elevator.getCurrentFloor().getFloorName(),
                elevator.getCurrentFloor().getFloorNumber(), elevator.getPeopleInside(), Elevator.WEIGHT_LIMIT);

        System.out.format("+------------+-----------------+---------------+---------------+---------------+--------------+%n");
    }
}

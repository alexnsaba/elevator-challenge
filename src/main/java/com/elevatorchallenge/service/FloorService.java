package com.elevatorchallenge.service;

import com.elevatorchallenge.dataloader.FloorPool;
import com.elevatorchallenge.entity.Floor;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author Niyonsaba Alex
 * @Since 12/05/2023
 * FloorService class  contains all the operational logic or methods of the floor
 */

public class FloorService {
    //Get Floor pool
    public static final List<Floor> floors = FloorPool.createFloorPool();

    private static final String floorFormatter = "| %-7s | %-15s |%n";

    public static void showAllFloors() {
        System.out.println();
        System.out.println("List of All floors");
        System.out.format("+---------+-----------------+%n");
        System.out.format("| Floor # | Floor Name      |%n");
        System.out.format("+---------+-----------------+%n");

        for (Floor f : floors) {
            System.out.format(floorFormatter, f.getFloorNumber(), f.getFloorName());
        }

        System.out.format("+---------+-----------------+%n");
    }

    public static Floor getFloorByNumber(int floorNumber) {
        //Filter through the floor list to return a floor with the provided ID
        List<Floor> filteredFloor = floors.stream().filter(f -> f.getFloorNumber() == floorNumber).collect(Collectors.toList());

        if (filteredFloor.isEmpty()) {
            throw new IndexOutOfBoundsException("Floor # " + floorNumber +
                    " doesn't exist. Please check menu option 5 for available floors.");
        }
        return filteredFloor.get(0);
    }
}

package com.elevatorchallenge.service;

import com.elevatorchallenge.dataloader.FloorPool;
import com.elevatorchallenge.entity.Floor;

import java.util.List;

public class FloorService {
    //Get Floor pool
    private static final List<Floor> floors = FloorPool.createFloorPool();

    private static final String floorFormatter = "| %-7s | %-15s |%n";

    public static void showAllFloors() {
        System.out.println("List of All floors");
        System.out.format("+---------+-----------------+%n");
        System.out.format("| Floor # | Floor Name      |%n");
        System.out.format("+---------+-----------------+%n");

        for (Floor f : floors) {
            System.out.format(floorFormatter, f.getFloorNumber(), f.getFloorName());
        }

        System.out.format("+---------+-----------------+%n");
    }
}
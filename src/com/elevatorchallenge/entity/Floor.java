package com.elevatorchallenge.entity;

/**
 * @Author Niyonsaba Alex
 * @Since 12/05/2023
 * Floor class is used as a blueprint for creating Floor objects
 */

public class Floor{
    private final String floorName;

    private final int floorNumber;

    //All Args constructor
    public Floor(String floorName, int floorNumber) {
        this.floorName = floorName;
        this.floorNumber = floorNumber;
    }

    public String getFloorName() {
        return floorName;
    }

    public int getFloorNumber() {
        return floorNumber;
    }
}

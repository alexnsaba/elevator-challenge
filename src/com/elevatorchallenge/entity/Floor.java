package com.elevatorchallenge.entity;

/**
 * @Author Niyonsaba Alex
 * @Since 12/05/2023
 * Floor class is used as a blueprint for creating Floor objects
 */

public class Floor {
    private String floorName;

    private int floorNumber;

    //All Args constructor
    public Floor(String floorName, int floorNumber) {
        this.floorName = floorName;
        this.floorNumber = floorNumber;
    }

    //No Args constructor

    public Floor() {
    }

    //Setters

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    //Getters

    public String getFloorName() {
        return floorName;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    @Override
    public String toString() {
        return "Floor{" +
                "floorName='" + floorName + '\'' +
                ", floorNumber=" + floorNumber +
                '}';
    }
}

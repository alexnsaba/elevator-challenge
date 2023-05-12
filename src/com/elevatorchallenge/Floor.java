package com.elevatorchallenge;

public enum Floor {
    groundFloor(0), firstFloor(1), secondFloor(2), thirdFloor(3),
    fourthFloor(4), fifthFloor(5), sixthFloor(6), seventhFloor(7);

    //Instance variable
    private final int floorNumber;

    //Define constructor to allow us to use integers as enum values
    Floor(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    //Get an array of floor numbers from the enum
    public static Floor[] getFloorNumbers() {
        Floor []marks = Floor.values();
        System.out.println(marks[0].floorNumber);
        return marks;
    }
}

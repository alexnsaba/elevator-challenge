package com.elevatorchallenge.entity;

/**
 * @Author Niyonsaba Alex
 * @Since 12/05/2023
 * Elevator class is used as a blueprint for creating Elevator objects
 */

public class Elevator {
    private final int id;

    private Status status;

    private Floor currentFloor;

    private final int peopleInside;

    //Elevator can only curry a maximum of 7 people
    public static final int WEIGHT_LIMIT = 7;

    //All Args Constructor
    public Elevator(int id, Status status, Floor currentFloor, int peopleInside) {
        this.id = id;
        this.status = status;
        this.currentFloor = currentFloor;
        this.peopleInside = peopleInside;
    }

    //Getters

    public int getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public Floor getCurrentFloor() {
        return currentFloor;
    }

    public int getPeopleInside() {
        return peopleInside;
    }

    //Setters

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setCurrentFloor(Floor currentFloor) {
        this.currentFloor = currentFloor;
    }
}

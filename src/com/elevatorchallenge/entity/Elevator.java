package com.elevatorchallenge.entity;

/**
 * @Author Niyonsaba Alex
 * @Since 12/05/2023
 * Elevator class is used as a blueprint for creating Elevator objects
 */

public class Elevator {
    private int id;

    private Status status;

    private Floor currentFloor;

    private int peopleInside;

    //Elavator can only curry a maximum of 7 people
    public static final int WEIGHT_LIMIT = 7;

    //All Args Constructor
    public Elevator(int id, Status status, Floor currentFloor, int peopleInside) {
        this.id = id;
        this.status = status;
        this.currentFloor = currentFloor;
        this.peopleInside = peopleInside;
    }

    //No Args Constructor
    public Elevator() {
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

    public void setId(int id) {
        this.id = id;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setCurrentFloor(Floor currentFloor) {
        this.currentFloor = currentFloor;
    }

    public void setPeopleInside(int peopleInside) {
        this.peopleInside = peopleInside;
    }
}

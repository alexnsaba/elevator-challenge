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

    private boolean isMoving;

    private int peopleInside;

    private WaitingList peopleWaiting;

    //Elavator can only curry a maximum of 7 people
    public static final int WEIGHT_LIMIT = 7;

    //All Args Constructor
    public Elevator(int id, Status status, Floor currentFloor, boolean isMoving, int peopleInside, WaitingList peopleWaiting) {
        this.id = id;
        this.status = status;
        this.currentFloor = currentFloor;
        this.isMoving = isMoving;
        this.peopleInside = peopleInside;
        this.peopleWaiting = peopleWaiting;
    }

    //No Args Constructor
    public Elevator(){}

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

    public boolean isMoving() {
        return isMoving;
    }

    public int getPeopleInside() {
        return peopleInside;
    }

    public WaitingList getPeopleWaiting() {
        return peopleWaiting;
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

    public void setMoving(boolean moving) {
        isMoving = moving;
    }

    public void setPeopleInside(int peopleInside) {
        this.peopleInside = peopleInside;
    }

    public void setPeopleWaiting(WaitingList peopleWaiting) {
        this.peopleWaiting = peopleWaiting;
    }

    @Override
    public String toString() {
        return "Elevator{" +
                "status=" + status +
                ", currentFloor=" + currentFloor +
                ", isMoving=" + isMoving +
                ", peopleInside=" + peopleInside +
                ", peopleWaiting=" + peopleWaiting +
                ", WEIGHT_LIMIT=" + WEIGHT_LIMIT +
                '}';
    }
}

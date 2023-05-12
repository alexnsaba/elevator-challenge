package com.elevatorchallenge;

import java.util.Set;

/**
 * @Author Niyonsaba Alex
 * @Since 12/05/2023
 * Elevator class is used as a blueprint for creating Elevator objects
 */

public class Elevator {
    private Status status;

    private Floor currentFloor;

    private boolean isMoving;

    private int peopleInside;

    private Set<WaitingList> peopleWaiting;

    //All Args Constructor
    public Elevator(Status status, Floor currentFloor, boolean isMoving, int peopleInside, Set<WaitingList> peopleWaiting) {
        this.status = status;
        this.currentFloor = currentFloor;
        this.isMoving = isMoving;
        this.peopleInside = peopleInside;
        this.peopleWaiting = peopleWaiting;
    }

    //No Args Constructor
    public Elevator(){}

    //Getters
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

    public Set<WaitingList> getPeopleWaiting() {
        return peopleWaiting;
    }

    //Setters

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

    public void setPeopleWaiting(Set<WaitingList> peopleWaiting) {
        this.peopleWaiting = peopleWaiting;
    }
}

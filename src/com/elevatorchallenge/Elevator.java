package com.elevatorchallenge;

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
}

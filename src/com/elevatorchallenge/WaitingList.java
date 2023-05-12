package com.elevatorchallenge;

/**
 * @Author Niyonsaba Alex
 * @Since 12/05/2023
 * WaitingList class is used as a blueprint for creating objects of people waiting on each floor
 */
public class WaitingList {
    private int floorNumber;
    private int numberOfPeopleWaiting;

    //All Args Constructor
    public WaitingList(int floorNumber, int numberOfPeopleWaiting) {
        this.floorNumber = floorNumber;
        this.numberOfPeopleWaiting = numberOfPeopleWaiting;
    }

    //No Args Constructor
    public WaitingList() {
    }

    //Getters

    public int getFloorNumber() {
        return floorNumber;
    }

    public int getNumberOfPeopleWaiting() {
        return numberOfPeopleWaiting;
    }

    //Setters

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public void setNumberOfPeopleWaiting(int numberOfPeopleWaiting) {
        this.numberOfPeopleWaiting = numberOfPeopleWaiting;
    }
}
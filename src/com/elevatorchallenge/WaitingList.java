package com.elevatorchallenge;

/**
 * @Author Niyonsaba Alex
 * @Since 12/05/2023
 * WaitingList class is used as a blueprint for creating objects of people waiting on each floor
 */
public class WaitingList {
    private Floor floor;

    private int numberOfPeopleWaiting;

    //All Args Constructor
    public WaitingList(Floor floor, int numberOfPeopleWaiting) {
        this.floor = floor;
        this.numberOfPeopleWaiting = numberOfPeopleWaiting;
    }

    //No Args Constructor
    public WaitingList() {
    }

    //Getters

    public Floor getFloor() {
        return floor;
    }

    public int getNumberOfPeopleWaiting() {
        return numberOfPeopleWaiting;
    }

    //Setters
    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public void setNumberOfPeopleWaiting(int numberOfPeopleWaiting) {
        this.numberOfPeopleWaiting = numberOfPeopleWaiting;
    }
}
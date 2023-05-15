package com.elevatorchallenge.entity;

/**
 * @Author Niyonsaba Alex
 * @Since 12/05/2023
 * WaitingList record/ final class is used as a blueprint for creating objects of people waiting on each floor
 */
public record WaitingList(int numberOfPeopleWaiting, Floor floor) {
}
package com.elevatorchallenge.service;

import com.elevatorchallenge.entity.Floor;
import com.elevatorchallenge.entity.WaitingList;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Niyonsaba Alex
 * @Since 12/05/2023
 * WaitingListService class  contains all the operational logic or methods of people waiting for elevators
 */

public class WaitingListService {
    public static List<WaitingList> peopleWaitingOnAllFloors = new ArrayList<>();

    public static void setPeopleWaitingOnFloor(int floorNumber, int numberOfPeopleWaiting) {

        //Get floor from which people are waiting
        Floor floor = FloorService.getFloorByNumber(floorNumber);

        //Create an instance of waiting list on the provided floor
        WaitingList waitingList = new WaitingList(numberOfPeopleWaiting, floor);

        //Add the waiting list to the waiting list of all Floors
        peopleWaitingOnAllFloors.add(waitingList);

        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.format("| Operation Successful, %d People waiting from %s have been added to the waiting list. | %n", numberOfPeopleWaiting, floor.getFloorName());
        System.out.println("-------------------------------------------------------------------------------------------------");
    }
}

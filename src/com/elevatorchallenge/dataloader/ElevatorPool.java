package com.elevatorchallenge.dataloader;

import com.elevatorchallenge.entity.Elevator;
import com.elevatorchallenge.entity.Floor;
import com.elevatorchallenge.entity.Status;
import com.elevatorchallenge.entity.WaitingList;

import java.util.List;

/**
 * @Author Niyonsaba Alex
 * @Since 12/05/2023
 * ElevatorPool class is used to create a collection of elevators once the application starts
 */
public class ElevatorPool {

    public static List<Elevator> createElevatorPool() {
        //Get the floors from the created floor pool
        List<Floor> floors = FloorPool.createFloorPool();

        //Get People waiting on the floors
        WaitingList peopleWaitingOnGroundFloor = new WaitingList(floors.get(0), 3);
        WaitingList peopleWaitingOnFirstFloor = new WaitingList(floors.get(1), 1);
        WaitingList peopleWaitingOnSeventhFloor = new WaitingList(floors.get(7), 0);

        //Create elevator objects that will added to the elevator pool
        Elevator elevatorOne = new Elevator(1, Status.IDLE, floors.get(0), false, 0, peopleWaitingOnGroundFloor);
        Elevator elevatorTwo = new Elevator(2, Status.MOVING_UP, floors.get(1), true, 3, peopleWaitingOnFirstFloor);
        Elevator elevatorThree = new Elevator(3, Status.MOVING_DOWN, floors.get(7), true, 4, peopleWaitingOnSeventhFloor);

        return List.of(elevatorOne, elevatorTwo, elevatorThree);
    }

}

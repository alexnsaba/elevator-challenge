package com.elevatorchallenge.dataloader;

import com.elevatorchallenge.entity.Elevator;
import com.elevatorchallenge.entity.Floor;
import com.elevatorchallenge.entity.Status;

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

        //Create elevator objects that will be added to the elevator pool
        Elevator elevatorOne = new Elevator(1, Status.IDLE, floors.get(0), 0);
        Elevator elevatorTwo = new Elevator(2, Status.MOVING_UP, floors.get(1), 3);
        Elevator elevatorThree = new Elevator(3, Status.MOVING_DOWN, floors.get(7), 4);

        //Add the elevator objects to the elevator pool
        return List.of(elevatorOne, elevatorTwo, elevatorThree);
    }
}

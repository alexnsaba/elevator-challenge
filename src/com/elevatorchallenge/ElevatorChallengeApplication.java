package com.elevatorchallenge;

import com.elevatorchallenge.dataloader.ElevatorPool;
import com.elevatorchallenge.entity.Elevator;

import java.util.List;

/**
 * @Author Niyonsaba Alex
 * @Since 12/05/2023
 * ElevatorChallengeApplication class is used to invoke all the the methods defined in the Elevator service class
 */

public class ElevatorChallengeApplication {

    public static void main(String[] args) {
        // Get default elevator pool
        List<Elevator> elevators = ElevatorPool.createElevatorPool();

        System.out.println("elevators");
        System.out.println(elevators.toString());
    }
}

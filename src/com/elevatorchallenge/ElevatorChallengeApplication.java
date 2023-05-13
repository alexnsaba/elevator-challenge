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
    //Console colors
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String WHITE_BACKGROUND= "\u001B[47m";
    public static final String ANSI_RESET = "\u001B[0m";

    //Menu Options
    public static final String MENU_OPTIONS = " 1. Show Status of all elevators \n 2. Show status of individual elevator \n " +
            "3. Call elevator to floor \n 4. Set number of people waiting on a floor \n 5. Show all floors ";

    public static void main(String[] args) {
        // Get default elevator pool
        List<Elevator> elevators = ElevatorPool.createElevatorPool();

        System.out.println(ANSI_GREEN + BLACK_BACKGROUND + " WELCOME TO OUR ELEVATORS " + ANSI_RESET);

        System.out.println("Enter Your Choice");

        System.out.println(ANSI_GREEN + MENU_OPTIONS + ANSI_RESET);

        System.out.println(elevators.toString());
    }
}

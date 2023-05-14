package com.elevatorchallenge;

import com.elevatorchallenge.service.ElevatorService;
import com.elevatorchallenge.service.FloorService;
import com.elevatorchallenge.service.WaitingListService;

import java.util.Scanner;

/**
 * @Author Niyonsaba Alex
 * @Since 12/05/2023
 * ElevatorChallengeApplication class is used to invoke all the the methods defined in the Elevator service class
 */

public class ElevatorChallengeApplication {
    //Customise console colors
    public static final String BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    //Menu Options
    public static final String MENU_OPTIONS = """
            1. Show Status of all elevators
            2. Show status of individual elevator
            3. Call elevator to floor
            4. Set number of people waiting on a floor
            5. Show all floors\s""".indent(1);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(ANSI_GREEN + BLACK_BACKGROUND + " WELCOME TO OUR ELEVATOR SYSTEM " + ANSI_RESET);

        System.out.println("Enter Your Choice");

        System.out.println(ANSI_GREEN + MENU_OPTIONS + ANSI_RESET);

        int menuOption = scanner.nextInt();

        if (menuOption == 1) {
            //Show the status of all elevators
            ElevatorService.showAllElevatorStatus();
        } else if (menuOption == 2) {
            //Show the status of an individual elevator
            System.out.println("Enter Elevator ID");

            int elevatorId = scanner.nextInt();

            ElevatorService.showElevatorStatusById(elevatorId);
        } else if (menuOption == 3) {
            //Call elevator to floor
            System.out.println("Enter the Floor Number");
            int floorNumber = scanner.nextInt();

            ElevatorService.callElevatorToFloor(floorNumber);
        } else if (menuOption == 4) {
            //Set people waiting on a floor
            System.out.println("Enter Floor Number");
            int floorNumber = scanner.nextInt();

            System.out.println("Enter the number of people waiting from floor " + floorNumber);
            int numberOfPeopleWaiting = scanner.nextInt();

            WaitingListService.setPeopleWaitingOnFloor(floorNumber, numberOfPeopleWaiting);
        } else if (menuOption == 5) {
            //Show all floors
            FloorService.showAllFloors();
        }
    }
}

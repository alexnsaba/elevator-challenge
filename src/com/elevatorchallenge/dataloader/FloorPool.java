package com.elevatorchallenge.dataloader;


import com.elevatorchallenge.entity.Floor;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author Niyonsaba Alex
 * @Since 12/05/2023
 * FloorPool class is used to create a collection of floors once the application starts
 */

public class FloorPool {

    public static List<Floor> createFloorPool() {
        Floor groundFloor = new Floor("Ground Floor", 0);
        Floor firstFloor = new Floor("First Floor", 1);
        Floor secondFloor = new Floor("Second Floor", 2);
        Floor thirdFloor = new Floor("Third Floor", 3);
        Floor fourthFloor = new Floor("Fourth Floor", 4);
        Floor fifthFloor = new Floor("Fifth Floor", 5);
        Floor sixthFloor = new Floor("Sixth Floor", 6);
        Floor seventhFloor = new Floor("Seventh Floor", 7);

        return List.of(groundFloor, firstFloor, secondFloor, thirdFloor, fourthFloor, fifthFloor, sixthFloor, seventhFloor);
    }
}

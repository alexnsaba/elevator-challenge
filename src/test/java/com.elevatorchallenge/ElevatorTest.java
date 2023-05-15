package com.elevatorchallenge.test;

import com.elevatorchallenge.service.ElevatorService;
import com.elevatorchallenge.service.FloorService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ElevatorTest {

    @Test
    public void testShowAllElevatorStatus() {
        ElevatorService.showAllElevatorStatus();
        assertFalse(ElevatorService.elevators.isEmpty());
    }

    @Test
    public void testShowElevatorStatusById() {
        ElevatorService.showElevatorStatusById(1);
        assertEquals(ElevatorService.elevators.get(0).getId(), 1);
    }

    @Test
    public void testCallElevatorToFloor() {
        ElevatorService.callElevatorToFloor(1);
        assertEquals(FloorService.floors.get(1).getFloorNumber(), 1);
    }
}

package com.elevatorchallenge.test;

import com.elevatorchallenge.service.FloorService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FloorTest {
    @Test
    public void testShowAllFloors() {
        FloorService.showAllFloors();
        assertEquals(FloorService.floors.get(1).getFloorName(), "First Floor");
    }
}

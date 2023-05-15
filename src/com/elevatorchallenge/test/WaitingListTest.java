package com.elevatorchallenge.test;

import com.elevatorchallenge.service.WaitingListService;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class WaitingListTest {
    @Test
    public void testSetPeopleWaitingOnFloor(){
        WaitingListService.setPeopleWaitingOnFloor(1, 10);
        assertFalse(WaitingListService.peopleWaitingOnAllFloors.isEmpty());
    }
}

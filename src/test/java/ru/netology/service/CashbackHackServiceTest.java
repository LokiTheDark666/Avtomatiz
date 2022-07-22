package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {

        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int results = service.remain(900);
        assertEquals(expected,results);
    }

    @Test
    public void testRemain2к(){
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int results = service.remain(1900);
        assertEquals(expected,results);
    }
    @Test
    public void testRemain1k(){
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int results = service.remain(1000);
        assertEquals(results,expected);
    }
}
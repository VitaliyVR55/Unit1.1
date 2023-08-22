package ru.netologi.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashBackHackerServiceTest {
    @Test
    public void valueBelowLimi() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 950;
        int expected = 50;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void valueEqualLimit() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void valueMoreLimit() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1050;
        int expected = 950;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}

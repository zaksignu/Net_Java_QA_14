package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketByPriceAscComparatorTest {
    static Ticket tick1 = new Ticket(4, 1500, "CHI", "ZIA", 1000);
    static Ticket tick2 = new Ticket(1, 1200, "OTP", "VKO", 1500);
    static Ticket tick3 = new Ticket(1, 1500, "OTP", "VKO", 1500);

    @Test
    void compareToPositive() {
        int expected = 300;
        assertEquals(expected, tick1.compareTo(tick2));
    }

    @Test
    void compareToNegative() {
        int expected = 0;
        assertEquals(expected, tick1.compareTo(tick3));
    }
}
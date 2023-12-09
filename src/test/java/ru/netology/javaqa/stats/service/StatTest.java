package ru.netology.javaqa.stats.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class StatTest {
    @Test
    public void testsum() {
        Stat service = new Stat();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum(sales);
        long expected = 180;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testavarage() {
        Stat service = new Stat();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.avarage(sales);
        long expected = 180 / 12;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testmaximum() {
        Stat service = new Stat();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.maximum(sales);
        long expected = 7;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testminimum() {
        Stat service = new Stat();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.minimum(sales);
        long expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void bellowMonths() {
        Stat service = new Stat();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.bellowMonths(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveMoths() {
        Stat service = new Stat();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.aboveMonths(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}

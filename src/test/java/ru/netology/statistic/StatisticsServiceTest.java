package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {
    StatisticsService service = new StatisticsService();
    @Test
    void findMax() {

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);

    }



    @Test
    void shouldCalculateSumMonth() {
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calculateSum(month);
        assertEquals(expected, actual);

        System.out.println(service.calculateSum(month));


    }

    @Test
    void shouldCalculateAverageSumMonth() {
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.calculateAverageSum(month);
        assertEquals(expected, actual);
        System.out.println(service.calculateAverageSum(month));
    }

    @Test
    void shouldCalculateLowAverage() {
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 4;
        long actual = service.calculateLowAverage(month);
        assertEquals(expected, actual);


        System.out.println(service.calculateLowAverage(month));
    }

    @Test
    void shouldCalculateUnderAverage() {
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.calculateUnderAverage(month);
        assertEquals(expected, actual);


        System.out.println(service.calculateUnderAverage(month));
    }

    @Test
    void shouldCalculateMaxSumMonth() {
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.calculateMaxMonth(month);
        assertEquals(expected, actual);


        System.out.println(service.calculateMaxMonth(month));
    }

    @Test
    void shouldCalculateMax() {
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 20;
        long actual = service.calculateMax(month);
        assertEquals(expected, actual);

        System.out.println(service.calculateMax(month));
    }

    @Test
    void shouldCalculateMinSumMonth() {
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.calculateMinMonth(month);
        assertEquals(expected, actual);


        System.out.println(service.calculateMinMonth(month));
    }

}
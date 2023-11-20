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
}
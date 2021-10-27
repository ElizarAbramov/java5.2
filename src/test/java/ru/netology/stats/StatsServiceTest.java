package ru.netology.stats;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class StatsServiceTest {

    @Test
    void shouldCalculateSumSales() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        long actual = statsService.sumSales(sales);

        assertEquals(expected, actual);
    }

    @Test

    void shouldCalculateAverageSales() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = statsService.averageSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMaxSales(){
        StatsService statsService = new StatsService();
        long[] sales={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = statsService.maxSales(sales);

        assertEquals(expected, actual);

    }

    @Test

    void shouldCalculateMinSales() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = statsService.minSales(sales);


        assertEquals(expected, actual);


    }

    @Test

    void shouldCalculateBelowAverage() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = statsService.belowAverage(sales);

        assertEquals(expected, actual);
    }

        @Test

        void shouldCalculateAboveAverage ( ){
            StatsService statsService = new StatsService();
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            int expected = 5;
            long actual = statsService.aboveAverage(sales);

            assertEquals(expected, actual);
        }
    }



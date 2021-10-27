package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
         long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageSales(long[] sales) {
        long sumSales = sumSales(sales);
        long average = sumSales/sales.length;
        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >=sales[maxMonth]){
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;

    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverage (long[] sales){
        int belowMonth = 0;
        long average = averageSales(sales);
        for(long sale : sales){
            if (sale < average )
                belowMonth++;

            }
            return belowMonth;
        }

     public int aboveAverage ( long[] sales){
        int aboveAverage = 0;
        long average = averageSales(sales);
        for ( long sale:sales){
            if (sale > average)
                aboveAverage++;
            }
            return aboveAverage;
     }
}








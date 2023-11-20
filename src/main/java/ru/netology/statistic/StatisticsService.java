package ru.netology.statistic;

public class StatisticsService {

    /**
     * Calculate index of max income
     *
     * @param incomes - array of incomes
     * @return - index of first max value
     */
    public long findMax(long[] incomes) {
        long current_max_index = 0;
        long current_max = incomes[0];
        for (long income : incomes)
            if (current_max < income)
                current_max = income;
        return current_max;
    }

    public long calculateSum(long[] purchases) {

        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public long calculateAverageSum(long[] purchases) {

        long sum = 0;
        long average = 0;
        for (long purchase : purchases) {
            sum += purchase;
            average = sum / purchases.length;
        }
        return average;
    }

    public long calculateLowAverage(long[] purchases) {

        long sum = 0;
        long average = 0;
        for (long purchase : purchases) {
            sum += purchase;
            average = sum / purchases.length;
        }
        long lowAverage = 0;
        for (int i = 1; i < purchases.length; i++) {
            if (purchases[i] < average) {
                lowAverage++;
            }

        }
        return lowAverage;
    }

    public long calculateUnderAverage(long[] purchases) {

        long sum = 0;
        long average = 0;
        for (long purchase : purchases) {
            sum += purchase;
            average = sum / purchases.length;
        }
        long lowAverage = 0;
        for (int i = 1; i < purchases.length; i++) {
            if (purchases[i] > average) {
                lowAverage++;
            }

        }
        return lowAverage;
    }

    public int calculateMaxMonth(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public long calculateMax(long[] purchases) {

        long max = purchases[0];
        for (long purchase : purchases) {
            if (max < purchase) {
                max = purchase;
            }
        }
        return max;
    }

    public int calculateMinMonth(long[] sales) {
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


}

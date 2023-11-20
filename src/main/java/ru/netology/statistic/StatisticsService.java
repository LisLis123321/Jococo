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
}

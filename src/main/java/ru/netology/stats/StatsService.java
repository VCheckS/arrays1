package ru.netology.stats;


public class StatsService {

    //   1
    public long sum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    //   2
    public long averageSum(long[] sales) {
        return sum(sales) / 12;
    }

    //   3
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    //   4
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    // 5
    public int lessAverage(long[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale < averageSum(sales)) {
                count++;
            }
        }

        return count;
    }

    // 6
    public int moreAverage(long[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale > averageSum(sales)) {
                count++;
            }
        }
        return count;
    }
}
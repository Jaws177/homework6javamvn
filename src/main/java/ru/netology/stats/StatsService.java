package ru.netology.stats;

public class StatsService {

    public int sumAllSales(int[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int middleOfAllSales(int[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        int quantity = sales.length;
        int middleSales = sum / quantity;
        return (int) middleSales;
    }

    public int maxSales(int[] sales) {
        int maxMonth = sales[0];

        for (int i = 0; i < sales.length; i++) {
            int sale = sales[maxMonth];
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int underMiddleSales(int[] sales) {
        int middle = middleOfAllSales(sales);
        int monthUnder = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < middle)
                monthUnder++;
        }
        return monthUnder;
    }

    public int overMiddleSales(int[] sales) {
        int middle = middleOfAllSales(sales);
        int monthOver = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > middle)
                monthOver++;
        }
        return monthOver;
    }
}
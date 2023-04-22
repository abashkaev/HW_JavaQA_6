package ru.netology.stats;

public class StatsService {
    public long allSales(long[] sales) {
        long allMoney = 0; // Общая сумма продаж
        for (int i = 0; i < sales.length; i++) {
            allMoney = allMoney + sales[i];
        }
        return allMoney;
    }

    public long getAverageSales(long[] sales) {
        long averageSales = allSales(sales) / sales.length;

        return averageSales;

    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int salesBelowAverage(long[] sales) {
        int mountBelowSale = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > getAverageSales(sales)) {
                mountBelowSale = mountBelowSale + 1;
            }
        }
        return mountBelowSale;
    }

    public int salesAboveAverage(long[] sales) {
        int mountAboveSale = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < getAverageSales(sales)) {
                mountAboveSale = mountAboveSale + 1;
            }
        }
        return mountAboveSale;
    }
}





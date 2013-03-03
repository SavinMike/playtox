package com.savin.playtox.column.money;

import java.text.NumberFormat;

public class Money implements Comparable<Money> {
    private double value;

    public Money(double value) {
        this.value = value;
    }

    public static Money stringToMoney(String s) {
        return new Money(Double.valueOf(s));
    }

    public String toString() {
        return NumberFormat.getInstance().format(value);
    }

    public int compareTo(Money m) {
        if (value > m.value)
            return 1;
        else if (value < m.value)
            return -1;
        return 0;
    }

}

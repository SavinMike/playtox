package com.savin.playtox.column.money;

import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;

public class Money implements Comparable<Money> {
    private double value;

    public Money(double value) {
        this.value = value;
    }

    public static Money stringToMoney(String s) {
        return new Money(Double.valueOf(s));
    }

    public String toString() {
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setMinimumFractionDigits(2);
        return numberFormat.format(value);
    }

    public int compareTo(Money m) {
        if (value > m.value)
            return 1;
        else if (value < m.value)
            return -1;
        return 0;
    }

}

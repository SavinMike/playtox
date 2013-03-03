package com.savin.playtox.column;

import com.savin.playtox.column.money.MoneyColumn;
import com.savin.playtox.column.string.StringColumn;
import com.savin.playtox.column.integer.IntegerColumn;

public class ColumnFactory {
    public static Column getNewClass(String classType, int columnNumber) {
        if (classType.equals("int")) {
            return new IntegerColumn(columnNumber);
        } else if (classType.equals("string")) {
            return new StringColumn(columnNumber);
        } else if (classType.equals("money")) {
            return new MoneyColumn(columnNumber);
        } else {
            System.out.println("Incorrect command");
            return null;
        }
    }
}

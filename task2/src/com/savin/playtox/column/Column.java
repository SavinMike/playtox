package com.savin.playtox.column;

import com.savin.playtox.parser.StringParser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Column<T extends Comparable<T>> {
    private int columnNumber;
    private List<T> data = new ArrayList<>();

    public Column(int columnNumber) {
        this.columnNumber = columnNumber;
    }

    public int getColumnNumber() {
        return columnNumber;
    }

    public void add(T addNewObject) {
        data.add(addNewObject);
    }

    public List<T> getData() {
        List<T> ls = data;
        return ls;
    }

    public int getDataSize() {
        return data.size();
    }

    public int maxLength() {
        T maxT = Collections.max(data);
        return maxT.toString().trim().length();
    }

    public String spaceString(String string, String ch) {
        StringBuilder sb = new StringBuilder();
        int diff = maxLength() - string.length();
        while (diff > 0) {
            sb = sb.append(ch);
            diff--;
        }
        return sb.toString();
    }

    public String toString(int i, int fullSizeColumn) {
        String s;
        if (i != -1)
            s = data.get(i).toString();
        else
            s = "";
        return StringParser.convNumber(fullSizeColumn, getColumnNumber(), spaceString(s, " "), s);

    }

}

package com.savin.playtox.writer;

import com.savin.playtox.column.Column;

import java.util.List;

public interface Writer {
    public void write(String s);

    public void close();

    public void writeStartTable(int fullLength, int columnSize);

    public void writeEndRow(List<Column> columns);
}

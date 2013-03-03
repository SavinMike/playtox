package com.savin.playtox.writer;

import com.savin.playtox.column.Column;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: BuOs
 * Date: 03.03.13
 * Time: 15:20
 * To change this template use File | Settings | File Templates.
 */
public interface Writer {
    public void write(String s);
    public void close();
    public void writeStartTable(int fullLength,int columnSize);
    public void writeEndRow(List<Column> columns);
}

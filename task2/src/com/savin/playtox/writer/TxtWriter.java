package com.savin.playtox.writer;

import com.savin.playtox.column.Column;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class TxtWriter implements Writer {
    private FileWriter fw;
    private PrintWriter out;

    public TxtWriter(String fileName) throws IOException {
        fw = new FileWriter(fileName);
        out = new PrintWriter(fw);
    }

    public TxtWriter(File file) throws IOException {
        fw = new FileWriter(file);
        out = new PrintWriter(fw);
    }

    public void write(String s) {
        out.write(s);
    }

    public void writeStartTable(int fullLength, int columnSize) {
        out.write("+");
        for (int i = 0; i < fullLength + columnSize - 1; i++)
            out.write("-");
        out.write("+\n");

    }

    public void close() {
        out.close();
        try {
            fw.close();
            System.out.println("All files close correct");
        } catch (IOException e) {
            System.out.println("Exception");
            e.printStackTrace();
        }

    }

    public void writeEndRow(List<Column> columns) {
        out.write("+");
        for (int i = 0; i < columns.size(); i++) {
            for (Column column : columns)
                if (i == column.getColumnNumber()) {
                    out.write(column.spaceString("", "-"));
                }
            out.write("+");
        }
        out.write("\n");
    }

}

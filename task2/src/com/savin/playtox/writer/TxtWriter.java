package com.savin.playtox.writer;

import com.savin.playtox.column.Column;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: BuOs
 * Date: 03.03.13
 * Time: 15:21
 * To change this template use File | Settings | File Templates.
 */
public class TxtWriter implements Writer {
    private FileWriter fw;
    private PrintWriter out ;
    public TxtWriter(String fileName) throws IOException {
        fw= new FileWriter(fileName);
        out = new PrintWriter(fw);
    }
    public TxtWriter(File file) throws IOException{
        fw= new FileWriter(file);
        out = new PrintWriter(fw);
    }

    public void write(String s){
        out.write(s);
    }
    public void writeStartTable(int fullLength,int columnSize){
        out.write("+");
        for(int i=0;i<fullLength+columnSize-1;i++)
            out.write("-");
        out.write("+\n");

    }
    public void close(){
        out.close();


    }

    public void writeEndRow(List<Column> columns) {
        out.write("+");
        for(int i=0;i<columns.size();i++){
            for(Column column:columns)
                if (i == column.getColumnNumber()) {
                    out.write(column.chString("", "-"));
                }
            out.write("+");
        }
        out.write("\n");
    }

}

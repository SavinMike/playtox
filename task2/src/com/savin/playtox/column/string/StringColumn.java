package com.savin.playtox.column.string;

import com.savin.playtox.column.Column;
import com.savin.playtox.parser.StringParser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: BuOs
 * Date: 02.03.13
 * Time: 22:32
 * To change this template use File | Settings | File Templates.
 */
public class StringColumn extends Column<String> {
    private List<String> strings;
    public StringColumn(int i){
        super(i);
    }

    public int maxLength(){
            strings=new ArrayList<>();

            for(String s:super.getData()){
                List<String> str=StringParser.parsString(s," ");
                if(!strings.containsAll(str))
                    strings.addAll(str);
            }

            int max=Collections.max(strings,new Comparator<String>() {
                public int compare(String o1, String o2) {
                    return o1.length()-o2.length();
                }
            }).length();

        return max;
    }
    public String toString(int i,int fullSizeColumn){
        String s=super.getData().get(i).toString();

        if(super.getData().get(i).contains(" ")){
            s=s.substring(0,s.indexOf(" "));
        }
        return StringParser.convString(fullSizeColumn,super.getColumnNumber(),super.chString(s," "),s);
    }


}

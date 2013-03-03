package com.savin.playtox.parser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: BuOs
 * Date: 02.03.13
 * Time: 23:26
 * To change this template use File | Settings | File Templates.
 */
public class StringParser{
    public static String getFirstSubstring(StringBuilder s, String del){
        String s1;
        if(s.indexOf(del)>=0)                     {
            s1=s.substring(0,s.indexOf(del));
            s1=s1.toLowerCase().trim();
            s=s.delete(0,s.indexOf(del)+1);
        }
        else{
            s1=s.toString().trim().toLowerCase();
            s=s.delete(0,s1.length());
        }
        return s1;
    }

    public static List<String> parsString(String s,String del){
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        String s1;

        List<String> strings=new ArrayList<>();
        while (sb.length()>0){
            s1=StringParser.getFirstSubstring(sb, " ");
            strings.add(s1);
        }
        return strings;
    }
    public static String convString(int countColumn,int columnNumber,String spaceString,String s) {
        if(columnNumber==0){
            return "|"+s+spaceString;
        }
        else if(columnNumber==countColumn-1){
            return "|"+s+spaceString+"|";
        }
        else{
            return "|"+s+spaceString;
        }
    }
    public static String convNumber(int countColumn,int columnNumber,String spaceString,String s) {
        if(columnNumber==0){
            return "|"+spaceString+s;
        }
        else if(columnNumber==countColumn-1){
            return "|"+spaceString+s+"|";
        }
        else{
            return "|"+spaceString+s;
        }
    }

}

package ru.playtox.savin.oop;

import java.util.Comparator;

public class Modulo implements Comparable<Modulo>{
    private int number;
    private String str;
    public Modulo(int number,String string){
        this.number=number;
        str=string;
    }
    public boolean aModuloNumber (int a){
        if(a%number==0){
            System.out.print(str+" ");
            return true;
        }
        return false;
    }
    public int compareTo(Modulo o){
        return o.number-number;
    }
}


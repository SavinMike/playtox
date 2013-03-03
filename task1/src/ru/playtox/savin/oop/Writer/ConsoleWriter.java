package ru.playtox.savin.oop.Writer;

import ru.playtox.savin.oop.Modulo;
import java.util.TreeSet;

public class ConsoleWriter implements Writer {
    public void write(int i,Modulo ... s){
        TreeSet<Modulo> set=new TreeSet<Modulo>();
        for(int j=0;j<s.length;j++){
            set.add(s[j]);
        }
        for(Modulo es:set){
            if(es.aModuloNumber(i))
                return;
        }
        System.out.print(i+" ");
    }
}

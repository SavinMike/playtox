package ru.playtox.savin.oop;

import ru.playtox.savin.oop.Writer.ConsoleWriter;
import ru.playtox.savin.oop.Writer.Writer;

public class Main {
    public static void main(String args[]){
        Modulo div3=new Modulo(3,"play");
        Modulo div5=new Modulo(5,"tox");
        Modulo div15=new Modulo(15,"playtox");
        Writer writer=new ConsoleWriter();
        for(int i=1;i<=150;i++){
            writer.write(i,div3,div5,div15);
        }
    }
}

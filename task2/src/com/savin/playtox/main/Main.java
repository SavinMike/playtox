package com.savin.playtox.main;

import com.savin.playtox.Convector.Convector;

import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: BuOs
 * Date: 03.03.13
 * Time: 23:08
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args){
        File csvFile=new File("text.csv");
        File file=new File("test.txt");

        try (Convector convector=new Convector(csvFile,file)){

            convector.addAllRow();
            convector.convert();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (NumberFormatException e){
            System.out.println("Incorrect data on the csv-table");
            e.printStackTrace();
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e);
            e.printStackTrace();
        }

    }
}

package com.savin.playtox.main;

import com.savin.playtox.Convector.Convector;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File csvFile = new File("text.csv");
        File file = new File("text.txt");

        try (Convector convector = new Convector(csvFile, file)) {

            convector.addAllRow();
            convector.convert();
            System.out.println("Done!");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Incorrect data on the csv-table");
            // e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
            // e.printStackTrace();
        }
    }
}

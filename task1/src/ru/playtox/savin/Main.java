package ru.playtox.savin;

public class Main {
    public static void main(String args[]){
        for(int i=1;i<=150;i++){
            if (i%15==0){
                System.out.print("playtox ");
                continue;
            }
            else if(i%5==0){
                System.out.print("tox ");
                continue;
            }
            else if(i%3==0){
                System.out.print("play ");
                continue;
            }
            else
                System.out.print(i+" ");
        }
    }
}
package com.company;

public class Beer {
    public static void main(String[] args) {

    }

    public static void beerCountDown(int number) {
        if (number < 0) {
            System.out.println(number + " Bottles of Beer on the wall, " + number + " Bottles of Beer");
            System.out.println("Take one down, pass it around, " + (number - 1) + " Bottles of Beer on the wall");
            beerCountDown(number - 1);
        }

    }
}

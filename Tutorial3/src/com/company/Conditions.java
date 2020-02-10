package com.company;

public class Conditions {
    public static void main(String[] args) {

        int number1 = 3;
        int number2 = 5;

        if (number1 == number2) {
            System.out.println("Number 1 is equal to number 2");
        } else {
            System.out.println("Number 1 is NOT equal to number 2");
        }

        // THE CHALLENGE

        int number3 = 3;
        int number4 = 5;

        if (number3 > number4) {
            System.out.println("Number 3 is equal to number 4");
        } else if (number3 > number4) {
            System.out.println("Number 3 is greater to number 4");
        } else {
            System.out.println("Number 3 is less to number 4");
        }

        String power = "on";

        switch (power) {
            case ("off"):
                System.out.println("Power is off");
                break;
            case ("on"):
                System.out.println("The power is on");
                break;
        }

    }
}

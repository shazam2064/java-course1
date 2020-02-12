package com.company;

public class Method {

    public static void main(String[] args) {

        addition(3, 12);
        addition2();
        multiplication(3, 5, 7);
        int number = multiplication2(3, 5, 7);
        System.out.println(number / 2);

        // Part of THE BIG BAD EVIL UGLY CHALLENGE

        double minimum = minimum(4.5, 4.5);
        if (minimum != -1) {
            System.out.println(minimum);
        }
        else {
            System.out.println("They are equal");
        }


    }

    static void addition(int a, int b) {
        System.out.println(a + b);

    }

    static void addition2() {
        int a = 3;
        int b = 12;
        System.out.println(a + b);

    }

    static void multiplication(int a, int b, int c) {
        System.out.println(a * b * c);
    }

    static int multiplication2(int a, int b, int c) {
        int multipliedValue = a * b * c;
        return multipliedValue;
    }

    // THE BIG BAD EVIL UGLY CHALLENGE

    static double minimum(double a, double b) {
        if (a < b) {
            return a;
        } else if (b < a) {
            return b;
        }
        return -1;
    }

}
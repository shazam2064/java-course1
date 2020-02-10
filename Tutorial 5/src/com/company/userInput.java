package com.company;

import java.util.Scanner;

public class userInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = sc.nextLine();

        System.out.println("Oh your name is " + name);

        // THE CHALLENGE

        System.out.println("What is your age");
        int age = sc.nextInt();

        System.out.println("Hi " + name + "! You are " + age);

        // Another THE CHALLENGE

        System.out.println("What is your favorite animal?");
        String animal = sc.nextLine();

        System.out.println("How many pets have you had?");
        int numberOfPets = sc.nextInt();

        System.out.println("Fav pet: " + animal + ", # of pets: " + numberOfPets);


    }
}

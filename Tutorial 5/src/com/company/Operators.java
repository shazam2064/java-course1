package com.company;

public class Operators {

    public static void main(String[] args) {

        int number1 = 2;
        int number2 = 19;

        System.out.println(number1 + number2);
        System.out.println(number1-number2);
        System.out.println(number1*number2);
        System.out.println(number2/number1);
        System.out.println(number2%number1);

        int age = 13;

        if (age>=10 && age<=18) {
            System.out.println("This person is a teenager");
        }
        else {
            System.out.println("This person is NOT  a teenager");
        }

        if(age < 10 || age > 18) {
            System.out.println("This person is NOT  a teenager");
        }

    }

}

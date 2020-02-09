package com.company;

public class Main {

    public static void main(String[] args ) {

        String[] animals = new String[5];
        animals[0] = "dog";
        animals[1] = "cat";
        animals[2] = "horse";
        animals[3] = "elephant";
        animals[4] = "lion";

        String[] animals1 = {"dog", "cat", "horse", "elephant", "lion"};

        System.out.println(animals[2]);

        for (int j = 0; j<animals.length; j++) {
            System.out.println(animals[j]);
        }

        // another array...

        int[] multiple = new int[5];
        multiple[0] = 3;
        multiple[1] = 6;
        multiple[2] = 9;
        multiple[3] = 12;
        multiple[4] = 15;

        int[] multiple1 = { 3, 6, 9, 12, 15};

        System.out.println(multiple[3]);

        for (int i = 0; i<multiple.length; i++) {
            System.out.println(multiple[i]);
        }


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // THE CHALLENGE
        System.out.println("THE CHALLENGE");

        int[] numbers = { 67, 8, 9, 10, 41, 32 };
        int index = 80;
        boolean indexFound = false;
        for (int n = 0; n < numbers.length; n++) {
            if (index == numbers[n]) {
                System.out.println(index + " "
                        + "is located at position " + n + " in the array numbers");
                indexFound = true;
            }
        }
        if(indexFound == false) { //!indexFound
            System.out.println(index + " was not found in the array numbers.");
        }

        String[] words = {"sleepy", "morning", "dogs", "school"};
        String[] duplicate = new String[words.length];
        int s = 0;
        while(s<words.length) {
            duplicate[s] = words[s];
            System.out.println(duplicate[s]);
            s++;
        }

        double[] decimals = {3.4, 2.8, 90.3, 178.6, 1.4, 204.5};
        double max = Double.MIN_VALUE; //0
        double min = Double.MAX_VALUE;
        for(int d =0; d< decimals.length; d++) {
            if(max < decimals[d]) {
                max = decimals[d]; //upgrading
            }
            if(min>decimals[d]) {
                min = decimals[d]; //downgrading
            }
        }
        System.out.println("The max in array decimals is " + max);
        System.out.println("The min in array decimals is " + min);
    }

}

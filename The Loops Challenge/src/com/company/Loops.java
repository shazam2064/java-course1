package com.company;

public class Loops {

    public static void main(String[] args) {
        int input = 6;
        int sum = 0;
        int oddNum = 1;
        System.out.println("***** for loop for # 1 *******");
        for(
                int i = 0;
                i<input;i++)

        {
            System.out.println(oddNum);
            sum = sum + oddNum;
            oddNum += 2;
        }
        System.out.println("The sum is "+sum);
        System.out.println("***** while loop for # 1 *******");
        while(input >0)

        {
            System.out.println(oddNum);
            sum = sum + oddNum;
            oddNum += 2;
            input--;
        }
        System.out.println("The sum is "+sum);


        System.out.println("***** for loop for # 2 *******");
        int height = 5;
        int count = 1;
        for(
                int h = 1;
                h<height +1;h++)

        {
            for (int spot = 0; spot < h; spot++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
        System.out.println("***** while loop for # 2 *******");
        int h = 1;
        while(h<=height)

        {
            int spot = 0;
            while (spot < h) {
                System.out.print(count + " ");
                count++;
                spot++;
            }
            h++;
            System.out.println();
        }
    }
}
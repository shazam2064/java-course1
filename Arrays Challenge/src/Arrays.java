public class Arrays {

    public static void main(String[] args) {

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
        if(indexFound == false) {
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

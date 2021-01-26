package org.horizoncolumbus.hs;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // declare the array and initializing
        int[] numbers = new int[]{1, 2, 3, 4, 5};

        //Array Literal
        //   int[] numbers = new int[] {1, 2, 3, 4, 5};

//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[2] = 3;
//        numbers[3] = 4;
//        numbers[4] = 5;
        //add data to the array
        for (int i = 1; i < 5; i++) {
            numbers[i] = i + 1;
        }


        //sum all the numbers in the array
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            sum = sum + numbers[i];
        }

        System.out.println(numbers[0] + " + " + numbers[1] + " + " + numbers[2] + " + " + numbers[3] + " + " + numbers[4] + " = " + sum);

        System.out.println();

    }}
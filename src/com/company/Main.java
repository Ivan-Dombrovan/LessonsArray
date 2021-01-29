package com.company;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int [] array = new int[10];
        for (int i= 0; i < array.length; i++) {
            array[i]=random.nextInt(50);
        }
        System.out.println("Array: "+Arrays.toString(array));

        //Max
        int max = array[0];
        for (int i : array) {
            if (max < i) {
                max = i;
            }
        }
        System.out.println("Max: "+max);

        //Min
        int min = array[0];
        for (int i : array)
            if (min > i) {
                min = i;
            }
        System.out.println("Min: "+min);

        //Avg
        int avg = array[0];
        for (int i : array) {
            avg += i / array.length;
        }
        System.out.println("Avg: "+avg);
        System.out.println("Heloo world");
    }
}

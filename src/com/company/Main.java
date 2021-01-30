package com.company;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        int[] array = new int[100];
        int value = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
            value++;
       }
        System.out.println("Array: " + Arrays.toString(array));
        for(int i = 2; i < 100; ++i){
            int count = 0;
            for(int j = 2; j <=i && count < 2;++j){
                if(i%j==0){
                    ++count;
                }
            }
            if(count<2)
                System.out.println(i);
        }

        }
    }


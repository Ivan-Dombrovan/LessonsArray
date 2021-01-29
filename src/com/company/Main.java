package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int a=-10;
        int b=10;
        int [][] array = new int[15][8];
        for (int i= 0; i < array.length; i++){
            for (int j = 0; j <array[i].length; j++) {
                array[i][j]=a+random.nextInt(b - a + 1);
                System.out.print(array[i][j]+ " ");
            }
        System.out.println();
       // System.out.println("Array: "+Arrays.toString(array));


    }
    }
}

package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Enter the number you want to delete ");
        int sc = scanner.nextInt();
        int value = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
            value++;
        }
        System.out.println("Array: " + Arrays.toString(array));
        }
    }


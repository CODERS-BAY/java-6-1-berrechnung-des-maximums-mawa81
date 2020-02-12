package com.codersbay.arraysmario;

import java.util.Scanner;

public class Aufgabe6_1_Maxima_Calculation {
    public static void main(String[] args) {
        int[] list = new int[0];
        Scanner scan = new Scanner(System.in);
        int number = 0;
        int count = 0;
        System.out.println("Please enter some numbers (q for quit)");
        while (!scan.hasNext("q")) {
            if (scan.hasNextInt()) {
                number = scan.nextInt();
                int[] tmp = new int[list.length + 1];
                for (int i = 0; i < list.length; i++) {
                    tmp[i] = list[i];
                }
                tmp[count] = number;
                list = tmp;
                count++;
            } else {
                scan.next();
                System.out.println("Input not possible!");
                System.out.println("Please enter numbers (q for quit)");
            }
        }
        int max_number = number;
        for (int j : list) {
            System.out.println(j);
            if (max_number < j) {
                max_number = j;
            }
        }
        System.out.println("The maximum value is " + max_number + ".");
    }
}

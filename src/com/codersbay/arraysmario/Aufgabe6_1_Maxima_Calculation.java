package com.codersbay.arraysmario;

import java.util.Scanner;

public class Aufgabe6_1_Maxima_Calculation {
    public static void main(String[] args) {
        int[] list = new int[0];
        //String lst = "";
        Scanner scan = new Scanner(System.in);
        int number;
        int count = 0;
        while (!scan.hasNext("q")) {
            number = scan.nextInt();
            //System.out.println(number);
            // lst+=number;

            int[] tmp = new int[list.length + 1];
            for (int i = 0; i < list.length; i++) {
                tmp[i] = list[i];
            }
            tmp[count] = number;
            list = tmp;
            count++;
        }
        for (int j : list) {
            System.out.println(j);
        }
    }
}

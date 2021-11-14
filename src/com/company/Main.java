package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        double[] numbers = {12.2, 6.4, -3.1, 54.5, -2.2, -5.23, 3.1, 5.5, 84.4, 64.3, -9.9, 45.4, 3.3, 74.3, 3.9, 56.7};
        double sum = 0;
        int negativeNumbers = 0;
        boolean negative = false;
        for (double d : numbers) {
            if (d < 0) {
                negative = true;
            } else {
                if (negative) {
                    negativeNumbers++;
                    sum += d;
                }
            }


        }
        System.out.println("Average " + sum / negativeNumbers);



        }















    }









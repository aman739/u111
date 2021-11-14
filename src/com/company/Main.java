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


        int[] metamorphosis = {-4, -7, 1, 5, 8, 2};
        int duration = 0;
        for (int i = 0; i < metamorphosis.length; i++) {
            for (int j = i + 1; j < metamorphosis.length; j++) {
                if (metamorphosis[i] > metamorphosis[j]) {
                    duration = metamorphosis[i];
                    metamorphosis[i] = metamorphosis[j];
                    metamorphosis[j] = duration;

                }

            }

        }
        System.out.println("Elements of the array sorted in the ascending order");
        for (int i = 0; i < metamorphosis.length; i++) {
            System.out.println(metamorphosis[i]);


        }














        
    }}









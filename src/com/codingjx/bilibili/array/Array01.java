package com.codingjx.bilibili.array;

import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        double[] chickens = {3.0, 5, 1, 3.4, 2, 50};
        double totalWeight = 0;

        for (int i = 0; i < chickens.length; i++) {
            totalWeight += chickens[i];
        }

        System.out.println("Total weight: " + totalWeight + " kg");
        System.out.println("Average weight: " + (totalWeight / chickens.length));
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        double[] scores = new double[5];
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Please enter number #" + (i + 1) + ":");
            scores[i] = scanner.nextDouble();
        }
        System.out.println();

        System.out.println("The scores you entered: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Number #" + (i + 1) + " = " + scores[i]);
        }
    }
}

package com.codingjx.bilibili.array;

public class Array01 {
    public static void main(String[] args) {
        double[] chickens = {3.0, 5, 1, 3.4, 2, 50};
        double totalWeight = 0;

        for (int i = 0; i < chickens.length; i++) {
            totalWeight += chickens[i];
        }

        System.out.println("Total weight: " + totalWeight + " kg");
        System.out.println("Average weight: " + (totalWeight / chickens.length));
    }
}

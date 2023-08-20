package com.codingjx.dsa.array;

import java.util.Arrays;

public class ArrayDemo01 {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3};
        System.out.println("numbers1: " + numbers1.toString());
        System.out.println("numbers1: " + Arrays.toString(numbers1));

        int[] numbers2 = new int[] {3, 2, 1};
        System.out.println("numbers2: " + numbers2.toString());
        System.out.println("numbers2: " + Arrays.toString(numbers2));

        int[] numbers3 = new int[3];
        numbers3[0] = 10;
        numbers3[1] = 20;
        numbers3[2] = 30;
        System.out.println("numbers3: " + numbers3.toString());
        System.out.println("numbers3: " + Arrays.toString(numbers3));


    }
}

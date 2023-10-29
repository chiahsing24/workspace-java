package com.codingjx.leetcodetips;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayTips {
    public static void main(String[] args) {
        // Initialize an array with default values
        int[] arr = new int[10];
        Arrays.fill(arr, 0);
        System.out.println("arr: " + Arrays.toString(arr));
        System.out.println();

        // Sort a primitive integer array in ascending order
        int[] integers = {5, -2, 23, 7, 13, -10, 6, 45, 87, -42, 509, 100};
        Arrays.sort(integers);
        System.out.println("integers: " + Arrays.toString(integers));
        System.out.println();

        // Sort a primitive integer array in descending order
        // option 1:
        // Collections.reverseOrder doesn't work for primitive types.
        Integer[] ints = {5, -2, 23, 7, 13, -10, 6, 45, 87, -42, 509, 100};
        Arrays.sort(ints, Collections.reverseOrder());
        System.out.println("ints: " + Arrays.toString(ints));
        System.out.println();

        // option 2:
        List<Integer> integersList = Arrays.asList(ints);
        Collections.sort(integersList);
        integers = integersList.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("integersList: " + integersList);
        System.out.println();

        // option 3:
        integersList = Arrays.stream(integers).boxed().collect(Collectors.toList());
        Collections.sort(integersList, Collections.reverseOrder());
        integers = integersList.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("integersList: " + integersList);
        System.out.println();
    }
}

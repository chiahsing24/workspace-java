package com.codingjx.dsa.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers1 = new ArrayList<>();
        System.out.println("numbers1: " + numbers1);
        System.out.println("numbers1 size: " + numbers1.size());
        System.out.println();

        ArrayList<Integer> numbers2 = new ArrayList<>(10);
        System.out.println("numbers2: " + numbers1);
        System.out.println("numbers2 size: " + numbers2.size());
        System.out.println();

        ArrayList<Integer> numbers3 = new ArrayList<>(Arrays.asList(30, 10, 20));
        numbers3.set(0, 10);
        System.out.println("numbers3: " + numbers3);
        System.out.println();

        ArrayList<Integer> numbers4 = new ArrayList<>();
        numbers4.add(1);
        numbers4.add(2);
        numbers4.add(3);
        numbers4.set(1, 0);
        numbers4.add(1, 11);
        numbers4.add(4, 12);
        System.out.println("numbers4: " + numbers4);
        System.out.println("numbers4 size: " + numbers4.size());
        System.out.println();

        numbers4.remove(0);
        System.out.println("numbers4 after remove(0): " + numbers4);
        System.out.println("numbers4 size after remove(0): " + numbers4.size());
        System.out.println();

        numbers4.remove(Integer.valueOf(0));
        System.out.println("numbers4 after remove(Integer.valueOf(0)): " + numbers4);
        System.out.println("numbers4 size after remove(Integer.valueOf(0)): " + numbers4.size());
        System.out.println();

        ArrayList<String> names = new ArrayList<>(Arrays.asList("John", "Tom", "Smith"));
    }
}

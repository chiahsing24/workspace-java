package com.codingjx.leetcodetips;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTips {
    public static void main(String[] args) {
        // Initialize an ArrayList with size = 10 and default value = 100
        ArrayList<Integer> list = new ArrayList<>(Collections.nCopies(10, 100));
        System.out.println("list: " + list);
    }
}

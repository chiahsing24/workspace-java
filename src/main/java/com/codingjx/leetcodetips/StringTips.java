package com.codingjx.leetcodetips;

import java.util.Arrays;

public class StringTips {
    public static void main(String[] args) {
        // How to sort characters in a string?
        String test = "edcba";
        char[] chars = test.toCharArray();
        Arrays.sort(chars);
        String sortedString = String.valueOf(chars);
        System.out.println("sortedString: " + sortedString);
        System.out.println();

        // How to convert character array to string?
        char[] sampleChars = {'a', 'p', 'p', 'l', 'e'};
        String str = new String(sampleChars);
        System.out.println("str: " + str);
        System.out.println();

        str = String.valueOf(sampleChars);
        System.out.println("str: " + str);
        System.out.println();

        str = String.copyValueOf(sampleChars);
        System.out.println("str: " + str);
        System.out.println();
    }
}

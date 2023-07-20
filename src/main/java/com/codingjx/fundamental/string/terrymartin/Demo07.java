package com.codingjx.fundamental.string.terrymartin;

public class Demo07 {
    public static void main(String[] args) {
        String firstWord = "Apple";
        String secondWord = "Apple";

        System.out.println(firstWord.compareTo(secondWord));

        String thirdWord = "Artist";
        String fourthWord = "Absence";
        System.out.println(firstWord.compareTo(thirdWord));
        System.out.println(firstWord.compareTo(fourthWord));
    }
}

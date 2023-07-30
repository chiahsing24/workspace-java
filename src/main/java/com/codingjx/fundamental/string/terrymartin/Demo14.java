package com.codingjx.fundamental.string.terrymartin;

public class Demo14 {
    public static void main(String[] args) {
        String firstText = "Apple";
        String secondText = "Apple";
        StringBuffer thirdText = new StringBuffer("Apple");

        System.out.println(firstText.contentEquals(secondText));
        System.out.println(secondText.contentEquals(thirdText));
    }
}

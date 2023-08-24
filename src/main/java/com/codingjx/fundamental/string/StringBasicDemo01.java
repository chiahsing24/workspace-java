package com.codingjx.fundamental.string;

/**
 *  1. String類型屬於引用類型
 */
public class StringBasicDemo01 {
    public static void main(String[] args) {
        String str1 = "Hello World!";
        System.out.println("str1: " + str1);
        System.out.println();

        String str2 = "";
        String str3 = "a";

        int num1 = 10;
        boolean b1 = true;
        String str4 = "hello";
        System.out.println("str4 + b1: " + str4 + b1);

        String str5 = str4 + b1;
        String str6 = str4 + b1 + num1;
        System.out.println("str4 + b1 + num1: " + str6);

        // 下面這句編譯不通過, 因為b1無法跟num1做運算
        // String str7 = b1 + num1 + str4;
    }
}

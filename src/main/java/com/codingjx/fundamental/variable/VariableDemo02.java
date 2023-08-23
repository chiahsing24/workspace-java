package com.codingjx.fundamental.variable;

/**
 *  基本數據類型變量間的運算規則
 *  1. 不包誇boolean類型
 *  2. 運算規則:
 *      a. 自動類型提升
 *      b. 強制類型轉換
 *
 *  byte, short, char, int ----> int ----> long ----> float ----> double
 *
 *  特別的: byte, short, char, int 之間運算, 結果需用 int 類型儲存
 *
 *  P.S. 容量小或大, 並非指佔用的內存空間大小, 而是指數據能表示範圍的大小
 */
public class VariableDemo02 {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = i1;

        long l1 = i1;

        float f1 = l1;

        byte b1 = 12;
        int i3 = b1 + i1;

        // 編譯不通過
        // byte b2 = b1 + i1;

        // 特殊情況 1
        byte b3 = 12;
        short s1 = 10;

        // 編譯不通過
        // short s2 = b3 + s1;

        i3 = b3 + s1;

        byte b4 = 10;

        // 編譯不通過
        // byte b5 = b3 + b4;

        // 特殊情況 2
        char c1 = 'a';

        // 編譯不通過
        // char c2 = c1 + b3;
        int i4 = c1 + b3;

        // 自動類型提升
        double double1 = 12;

        // 編譯不通過
        // int interger1 = double1;

        int integer2 = (int) double1;
        System.out.println("integer2: " + integer2);

        long long1 = 123;
        // 編譯不通過
        // short short1 = long1;
        short short2 = (short) long1;
        System.out.println("short2: " + short2);

        int integer3 = 12;
        // 自動類型提升
        float float1 = integer3;
        System.out.println("float1: " + float1);

        // 精度損失例子
        double double2 = 12.9;
        int integer4 = (int) double2;
        System.out.println("integer4: " + integer4);

        // 精度損失例子
        int integer5 = 128;
        byte byte1 = (byte) integer5;
        System.out.println("byte1: " + byte1);

    }
}

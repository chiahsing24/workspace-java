package com.codingjx.fundamental.variable;

public class VariableDemo01 {
    /**
     *  Variable types in Java
     *      Integer: byte (1 byte) / short (2 bytes) / int (4 bytes) / long (8 bytes)
     *      Float number: float (4 bytes) / double (8 bytes)
     *      Character: char (2 bytes)
     *      Boolean: boolean
     *
     *  Reference types in Java
     *      class
     *      array
     *      interface
     *      enum
     *      annotation
     *      record
     */
    public static void main(String[] args) {
        // Method1 to declare variable
        char gender;
        gender = '男';
        gender = '女';
        System.out.println("gender: " + gender);
        System.out.println();

        // Method2 to declare variable
        int age = 18;
        System.out.println("age: " + age);
        System.out.println();

        byte b1 = 12;
        byte b2 = 127;

        short s1 = 1234;

        int i1 = 12323131;

        long l1 = 1233210981L;

        double d1 = 12.3;

        // float變量表述範圍較double類型大, 但double類型表述精度較float類型細
        float f1 = 32.12f;

        System.out.println("0.1 + 0.2 = " + (0.1 + 0.2));

        float ff1 = 123123123f;
        float ff2 = ff1 + 1;
        System.out.println("ff1: " + ff1);
        System.out.println("ff2: " + ff2);
        System.out.println("ff1 == ff2: " + (ff1 == ff2));

        boolean bo1 = true;
        boolean b02 = false;
    }
}

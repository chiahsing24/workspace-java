package com.codingjx.basics.sec01_classes;

class Student {
    int id = 1000;

    byte age = 18;
    //    byte rank = 165; // [-128, 127]
    byte rank = 127;
    short rank_s = 165;
//    int phone = 2234567890; // interger number too large
//    int phone = 2234567890L; //  imcompatible type
    long phone_l = 223_456_7890L;

    int minValue = Integer.MIN_VALUE;
    int maxValue = Integer.MAX_VALUE;

    void compute() {
        int nextId = id + 1;
        System.out.println("id: " + id);
        System.out.println("nextId: " + nextId);
        System.out.println("age: " + age);
        System.out.println("phone: " + phone_l);
        System.out.println("minValue: " + minValue);
        System.out.println("maxValue: " + maxValue);
    }
}

public class Demo01 {
    public static void main(String[] args) {
        Student s = new Student();
        s.compute();
        primitives();
    }

    static void primitives() {
        System.out.println("\n\nInside primitives ...");
        int intHex = 0x0041; // 16 power of 0 * 1 + 16 power of 1 * 4 + ...
        System.out.println("intHex: " + intHex);

        int intBinary = 0b01000001;
        System.out.println("intBinary: " + intBinary);
    }
}

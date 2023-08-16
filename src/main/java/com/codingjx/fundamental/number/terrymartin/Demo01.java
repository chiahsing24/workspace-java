package com.codingjx.fundamental.number.terrymartin;

import java.util.Random;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println(Math.ceil(5.0));
        System.out.println(Math.ceil(5.4));
        System.out.println(Math.ceil(5.6));
        System.out.println(Math.random());
        System.out.println(Math.round(5.0));
        System.out.println(Math.round(5.2));
        System.out.println(Math.sqrt(81));
        System.out.println(Math.PI);
        System.out.println(Math.E);

        Random random = new Random();
        System.out.println(random.nextInt(10));
    }
}

package com.codingjx.fundamental.number.terrymartin;

public class Demo05 {
    public static void main(String[] args) {
        int num1 = 7;
        Integer num1B = Integer.valueOf(num1);
        Double myDouble = Double.valueOf(123.123);
        Float myFloat = Float.valueOf(23.23f);
        Byte myByte = Byte.valueOf("23");

        System.out.println(num1B.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myFloat.floatValue());
        System.out.println(myByte.byteValue());
        storeData(num1);

        int age = Integer.parseInt("37");
        double amount = Double.parseDouble("345.123");
        boolean flag = Boolean.parseBoolean("false");
    }

    public static void storeData(Object obj) {

    }
}

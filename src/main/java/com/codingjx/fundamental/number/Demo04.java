package com.codingjx.fundamental.number;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Demo04 {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("203982.29392839");
        BigDecimal num2 = new BigDecimal(3.141592);

        short shortNum = 12;
        BigDecimal num3 = new BigDecimal(shortNum);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        System.out.println(num3.intValue());
        System.out.println(num3.toString());

        BigInteger myInt = new BigInteger("1233123123123");
        System.out.println(myInt);
    }
}

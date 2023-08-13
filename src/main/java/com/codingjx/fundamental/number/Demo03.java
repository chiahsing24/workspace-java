package com.codingjx.fundamental.number;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import static java.lang.Math.sqrt;

public class Demo03 {
    public static void main(String[] args) {
        // Precision n, meaning n number of meaningful digits
        MathContext mc = new MathContext(5, RoundingMode.HALF_UP);
        System.out.println(new BigDecimal(".3145683").add(new BigDecimal("5.321")));
        System.out.println(new BigDecimal(".03145683").divide(new BigDecimal("5.321"), mc));
        System.out.println(new BigDecimal("49").sqrt(mc));
        // Compare which one is bigger
        System.out.println(new BigDecimal("7").max(new BigDecimal("13")));
        System.out.println(new BigDecimal("-2").abs());
        System.out.println(new BigDecimal("13").remainder(new BigDecimal("8")));
    }
}

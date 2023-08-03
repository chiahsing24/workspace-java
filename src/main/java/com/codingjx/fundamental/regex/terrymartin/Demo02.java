package com.codingjx.fundamental.regex.terrymartin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo02 {
    public static void main(String[] args) {
        String regex = "(1[-.,\\s]?)?(\\d{3}[-.,\\s]?)(\\d{3}[-.,\\s]?)\\d{4}";
        String phoneNumber = "1.232.333.2365";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);

        if (matcher.matches()) {
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
            System.out.println(matcher.group(3));
        }
    }
}

package com.codingjx.fundamental.string.terrymartin;

public class Demo11 {
    public static void main(String[] args) {
        String myText = "ABCDEFGABCDEFG";

        System.out.println(myText.indexOf(65));
        System.out.println(myText.indexOf("A", 2));

        String phoneNumber = "(234) 333-5551";
        String areaCode = parseAreaCode(phoneNumber);
        String exchange = parseExchange(phoneNumber);
        String lineNumber = parseLineNumber(phoneNumber);

        System.out.println(areaCode);
        System.out.println(exchange);
        System.out.println(lineNumber);
    }

    public static String parseAreaCode(String phoneNumber) {
        int openParens = phoneNumber.indexOf("(");
        int closeParens = phoneNumber.indexOf(")");
        String areaCode = phoneNumber.substring(openParens + 1, closeParens);
        return areaCode;
    }

    public static String parseExchange(String phoneNumber) {
        int spaceIdx = phoneNumber.indexOf(" ");
        int hyphenIdx = phoneNumber.indexOf("-");
        String exchange = phoneNumber.substring(spaceIdx + 1, hyphenIdx);
        return exchange;
    }

    public static String parseLineNumber(String phoneNumber) {
        int hyphenIdx = phoneNumber.indexOf("-");
        return phoneNumber.substring(hyphenIdx + 1);
    }
}

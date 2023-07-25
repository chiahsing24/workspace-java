package com.codingjx.fundamental.string.terrymartin;

public class Demo09 {
    public static void main(String[] args) {
        String text1 = "this is my text1";
        String text2 = "this is my text2";
        System.out.println(text1 + " " + text2 + " hello");

        System.out.println(text1.concat(text2));

        // Newer
        StringBuilder finalString = new StringBuilder()
                .append(text1)
                .append(" ")
                .append(text2);
        System.out.println(finalString.toString());

        // Older
        StringBuffer otherFinalString = new StringBuffer()
                .append(text1)
                .append(" ")
                .append(text2);
        System.out.println(otherFinalString);

        System.out.format("%s %s\n", text1, text2);

        String otherFinalString2 = String.format("%s %s", text1, text2);
        System.out.println(otherFinalString2);

    }
}

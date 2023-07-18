package com.codingjx.fundamental.string.terrymartin;

public class Demo06 {
    public static void main(String[] args) {
        String myText = "Apples";

        int index = 3;
        if (index < myText.length()) {
            System.out.println("myText.charAt(" + index + "): " + myText.charAt(index));
        }
    }
}

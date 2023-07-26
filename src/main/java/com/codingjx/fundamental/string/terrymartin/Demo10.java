package com.codingjx.fundamental.string.terrymartin;

public class Demo10 {
    public static void main(String[] args) {
        String myText = "apple";
        String myNewText = myText.substring(0, 1).toUpperCase() + myText.substring(1);
        System.out.println(myNewText);

        StringBuilder sb = new StringBuilder(myNewText).append(" is my name.");
        System.out.println(sb.toString());
    }
}

package com.codingjx.fundamental.string.terrymartin;

public class Demo13 {
    public static void main(String[] args) {
        String filename1 = "myfile.txt";
        System.out.println(filename1.endsWith("txt"));

        String filename2 = "file001.txt";
        System.out.println(filename2.startsWith("file"));

        String filename3 = "  filename002.txt";
        System.out.println(filename3.strip().startsWith("file"));
    }
}

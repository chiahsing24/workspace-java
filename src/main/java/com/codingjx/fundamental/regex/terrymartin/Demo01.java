package com.codingjx.fundamental.regex.terrymartin;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println("cat".matches("cat"));

        System.out.println("cat".matches("[cC]at"));
        System.out.println("bat".matches("[cC]at"));
        System.out.println("bat".matches("[cCbB]at"));

        System.out.println("cat".matches("[a-fA-F]at"));
        System.out.println("cat".matches("[^c]at"));
        System.out.println("cat".matches("[^C]at"));
        System.out.println("flat".matches("[^c]at"));
        System.out.println("lat".matches("[^a-z]at"));

        System.out.println("Lat".matches("\\wat"));
        System.out.println("_at".matches("\\wat"));
        System.out.println("-at".matches("\\wat"));
        System.out.println("4at".matches("\\wat"));

        System.out.println("___".matches("\\w\\w\\w\\w"));

        System.out.println("1".matches("\\d"));
        System.out.println("123".matches("\\d\\d\\d"));
        System.out.println("321-333-7652".matches("\\d\\d\\d-\\d\\d\\d-\\d\\d\\d\\d"));
        System.out.println("321-333-7652".matches("\\d{3}-\\d{3}-\\d{4}"));
        System.out.println("1-321-333-7652".matches("\\d{3}-\\d{3}-\\d{4}"));
        System.out.println("321-333-7652".matches("\\d{3}[-.]\\d{3}[-.]\\d{4}"));
        System.out.println("321.333.7652".matches("\\d{3}[-.,\\s]\\d{3}[-.,\\s]\\d{4}"));
        System.out.println("321 333 7652".matches("\\d{3}[-.,\\s]\\d{3}[-.,\\s]\\d{4}"));
        System.out.println("321,333,7652".matches("\\d{3}[-.,\\s]\\d{3}[-.,\\s]\\d{4}"));
        System.out.println("321  333 7652".matches("\\d{3}[\\s]+\\d{3}[\\s]+\\d{4}"));
        System.out.println("3213337652".matches("\\d{3}[\\s]*\\d{3}[\\s]*\\d{4}"));
        System.out.println("321 333 7652".matches("\\d{3}[\\s]?\\d{3}[\\s]?\\d{4}"));
        System.out.println("321 333 765".matches("\\d{3}[\\s]?\\d{3}[\\s]?\\d{3,4}"));
        System.out.println("321 333 76532".matches("(\\d{3}[\\s]?){2}\\d{3,}"));
        System.out.println("321 76532".matches("(\\d{3}[\\s]?){2}\\d{3,}"));
        System.out.println("321 76532".matches("(\\d{3}[\\s]?){1,2}\\d{3,}"));
        System.out.println("1.321.765.3222".matches("(\\d[\\s.]?)?(\\d{3}[\\s.]?){1,2}\\d{4}"));

    }
}

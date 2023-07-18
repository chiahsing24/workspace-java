package com.codingjx.fundamental.string.terrymartin;

public class Demo05 {
    public static void main(String[] args) {
        String firstName = "    Jake  ";
        System.out.format("'%s'", firstName.strip());
        System.out.println();

        System.out.format("'%s'", firstName.stripLeading());
        System.out.println();

        System.out.format("'%s'", firstName.stripTrailing());
        System.out.println();

        // text block
        String multiLineStr = """
                first line here
                second line here
                third line here
                ...
                """;
        System.out.println("multiLineStr: ");
        System.out.println(multiLineStr);

        String html = """
                        <html>
                                    <div>here's a div block</div>
                                            </html>
                """;
        System.out.format("'%s'", html.stripIndent());
        System.out.println();

        System.out.format("'%s'", firstName.trim());
        System.out.println();

        System.out.format("'%s'", split(firstName));

    }

    public static String split(String text) {
        return text.replace(" ", "");
    }
}

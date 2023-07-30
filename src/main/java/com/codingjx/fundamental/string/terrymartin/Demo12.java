package com.codingjx.fundamental.string.terrymartin;

public class Demo12 {
    public static void main(String[] args) {
        String text = """
                Smith,Fred,1/1/79,1111 ABC St.,Apple,CA
                McGuire,Jerry,2/2/80,2222 DEF St.,Orange,NV
                Flinstone,Fred,3/3/81,3333 GHI St.,Pear,MO
                Rubble,Barney,4/4/82,4444 JKL St.,Pineapple,IL
                Jetson,George,5/5/83,5555 MNO St.,Grapefruit,NY
                """;

        String[] people = text.split("\n");
        System.out.println(people.length);

        for (int i = 0; i < people.length; i++) {
            String[] information = people[i].split(",");
            String firstName = information[0];
            String lastName = information[1];
            String birthDate = information[2];
            String address = information[3];
            System.out.println(firstName
                    .concat(" ")
                    .concat(lastName)
                    .concat("'s birth day is on ")
                    .concat(birthDate)
                    .concat(", and lives at ")
                    .concat(address));
        }
    }
}

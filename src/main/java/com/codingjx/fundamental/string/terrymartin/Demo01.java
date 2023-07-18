package com.codingjx.fundamental.string.terrymartin;

public class Demo01 {
    public static void main(String[] args) {
        String fruit = "apple";
        String anotherFruit = "apple";
        String vegetable = new String("broccoli");
        String anotherVegetable = new String("broccoli");

        System.out.println("fruit == anotherFruit: ");
        System.out.println(fruit == anotherFruit);

        System.out.println();
        System.out.println("vegetable == anotherVegetable:");
        System.out.println(vegetable == anotherVegetable);
    }
}
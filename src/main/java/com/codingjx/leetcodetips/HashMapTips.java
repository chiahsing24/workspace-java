package com.codingjx.leetcodetips;

import java.util.HashMap;
import java.util.Map;

public class HashMapTips {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("HashMap: " + numbers);
        System.out.println();

        // entrySet() returns a set view of all entries
        // for-each loop access each entry from the view
        System.out.print("Entries: ");
        for(Map.Entry<String, Integer> entry: numbers.entrySet()) {
            System.out.print(entry);
            System.out.print(", ");
        }
        System.out.println();

        for(Map.Entry<String, Integer> entry: numbers.entrySet()) {
            System.out.print("(key = " + entry.getKey() + ", value = " + entry.getValue() + ")");
            System.out.print(", ");
        }
        System.out.println();
        System.out.println();

        System.out.print("Keys: ");
        // keySet() returns a set view of all keys
        // for-each loop access each key from the view
        for(String key: numbers.keySet()) {
            System.out.print(key + ", ");
        }
        System.out.println();

        // create an HashMap
        HashMap<String, Integer> prices = new HashMap<>();

        // insert entries to the HashMap
        prices.put("Shoes", 200);
        prices.put("Bag", 300);
        prices.put("Pant", 150);
        System.out.println("HashMap: " + prices);
        System.out.println();

        // return view of all values
        System.out.println("Values: " + prices.values());
        System.out.println();

        // values() returns a view of all values
        // for-each loop access each value from the view
        for(int value: prices.values()) {
            System.out.print(value + ", ");
        }
        System.out.println();
    }
}

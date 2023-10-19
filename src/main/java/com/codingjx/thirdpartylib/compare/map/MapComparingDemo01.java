package com.codingjx.thirdpartylib.compare.map;

import java.util.HashMap;
import java.util.Map;

public class MapComparingDemo01 {
    public static void main(String[] args) {
        Map<String, String> asiaCapital1 = new HashMap<String, String>();
        asiaCapital1.put("Japan", "Tokyo");
        asiaCapital1.put("South Korea", "Seoul");

        Map<String, String> asiaCapital2 = new HashMap<String, String>();
        asiaCapital2.put("South Korea", "Seoul");
        asiaCapital2.put("Japan", "Tokyo");

        Map<String, String> asiaCapital3 = new HashMap<String, String>();
        asiaCapital3.put("Japan", "Tokyo");
        asiaCapital3.put("China", "Beijing");

        Map<String, String> asiaCapital4 = new HashMap<String, String>();
        asiaCapital4.put("Japan", "Tokyo");
        asiaCapital4.put("South Korea", "Seoul 1");

        boolean hasDiff1 = asiaCapital1.equals(asiaCapital2);
        boolean hasDiff2 = asiaCapital1.equals(asiaCapital3);
        boolean hasDiff3 = asiaCapital1.equals(asiaCapital4);

        System.out.println("hasDiff1: " + hasDiff1);
        System.out.println("hasDiff2: " + hasDiff2);
        System.out.println("hasDiff3: " + hasDiff3);
    }
}

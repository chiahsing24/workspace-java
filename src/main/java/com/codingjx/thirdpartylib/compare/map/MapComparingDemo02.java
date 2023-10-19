package com.codingjx.thirdpartylib.compare.map;

import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;

import java.util.HashMap;
import java.util.Map;

public class MapComparingDemo02 {
    public static void main(String[] args) {
        Map<String, String> asia1 = new HashMap<String, String>();
        asia1.put("Japan", "Tokyo");
        asia1.put("South Korea", "Seoul");
        asia1.put("India", "New Delhi");
        asia1.put("Taiwan", "Taipei");
        asia1.put("China", "Beijing");

        Map<String, String> asia2 = new HashMap<String, String>();
        asia2.put("Japan", "Tokyo");
        asia2.put("China", "Shanghai");
        asia2.put("India", "Delhi");
        asia2.put("Taiwan", "Taipei");
        asia2.put("Thailand", "Bangkok");

        Map<String, String> asia3 = new HashMap<String, String>();
        asia3.put("Japan", "Tokyo");
        asia3.put("South Korea", "Seoul");
        asia3.put("India", "New Delhi");
        asia3.put("Taiwan", "Taipei");
        asia3.put("China", "Beijing");

        System.out.println("Test case 1:");
        MapDifference<String, String> diff = Maps.difference(asia1, asia2);
        System.out.println("diff: " + diff);

        Map<String, MapDifference.ValueDifference<String>> entriesDiffering = diff.entriesDiffering();
        System.out.println("entriesDiffering: " + entriesDiffering);
        System.out.println("entriesDiffering.isEmpty(): " + entriesDiffering.isEmpty());
        boolean areEqual = diff.areEqual();
        System.out.println("areEqual: " + areEqual);

        int numOfDifferentEntries = entriesDiffering.size();
        System.out.println("numOfDifferentEntries: " + numOfDifferentEntries);

//        assertFalse(diff.areEqual());
//        assertEquals(1, entriesDiffering.size());
//        assertThat(entriesDiffering, hasKey("India"));
//        assertEquals("New Delhi", entriesDiffering.get("India").leftValue());
//        assertEquals("Delhi", entriesDiffering.get("India").rightValue());

        System.out.println();
        System.out.println();
        System.out.println("Test case 2:");
        MapDifference<String, String> diff2 = Maps.difference(asia1, asia3);
        System.out.println("diff2: " + diff2);

        Map<String, MapDifference.ValueDifference<String>> entriesDiffering2 = diff2.entriesDiffering();
        System.out.println("entriesDiffering2: " + entriesDiffering2);
        System.out.println("entriesDiffering2.isEmpty(): " + entriesDiffering2.isEmpty());
        boolean areEqual2 = diff2.areEqual();
        System.out.println("areEqual2: " + areEqual2);

        int numOfDifferentEntries2 = entriesDiffering2.size();
        System.out.println("numOfDifferentEntries: " + numOfDifferentEntries2);
    }
}

package com.codingjx.leetcodetips;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTips {
    public static void main(String[] args) {
        /**
         *  Initialize a LinkedList
         */
        // option 1
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println("linkedList: " + linkedList);
        System.out.println();

        // option 2, using existing Collection
        List<Integer> integers = Arrays.asList(1, 3, 5, 7, 9);
        linkedList = new LinkedList<>(integers);
        System.out.println("linkedList: " + linkedList);
        System.out.println();

        /**
         *  Insert an element
         */
        List<Integer> extraIntegers = Arrays.asList(-2, -4, -6, -8, -10);
        linkedList.clear();
        linkedList.add(4);
        linkedList.add(6);
        linkedList.add(8);
        linkedList.addLast(10);
        linkedList.addFirst(0);
        linkedList.add(1, 2);
        linkedList.addAll(extraIntegers);
        System.out.println("linkedList: " + linkedList);
        System.out.println();

        /**
         *  Fetching element
         */
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.get(1));
        System.out.println();

        /**
         *  Removing element
         */
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList.remove(1));
        System.out.println(linkedList.remove(new Integer(10)));
        System.out.println("linkedList: " + linkedList);
        System.out.println();

        /**
         *  Sorting
         */
        Collections.sort(linkedList);
        System.out.println("sorting linkedlist in asc order: " + linkedList);
        Collections.sort(linkedList, Collections.reverseOrder());
        System.out.println("sorting linkedlist in desc order: " + linkedList);
        System.out.println();
    }
}

package com.codingjx.leetcodetips;

import java.util.*;

public class QueueTips {
    public static void main(String[] args) {
        // LinkedList implementation of Queue
        Queue<String> animal1 = new LinkedList<>();

        // Array implementation of Queue
        Queue<String> animal2 = new ArrayDeque<>();

        // Priority Queue implementation of Queue
        Queue<String> animal3 = new PriorityQueue<>();

        // Creating Queue using the LinkedList class
        Queue<Integer> numbers = new LinkedList<>();

        // offer elements to the Queue
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);
        System.out.println("Queue: " + numbers);

        // Access elements of the Queue
        int accessedNumber = numbers.peek();
        System.out.println("Accessed Element: " + accessedNumber);

        // Remove elements from the Queue
        int removedNumber = numbers.poll();
        System.out.println("Removed Element: " + removedNumber);

        System.out.println("Updated Queue: " + numbers);

        // Creating Queue using the PriorityQueue class
        numbers = new PriorityQueue<>();

        // offer elements to the Queue
        numbers.offer(5);
        numbers.offer(1);
        numbers.offer(2);
        System.out.println("Queue: " + numbers);

        // Access elements of the Queue
        accessedNumber = numbers.peek();
        System.out.println("Accessed Element: " + accessedNumber);

        // Remove elements from the Queue
        removedNumber = numbers.poll();
        System.out.println("Removed Element: " + removedNumber);

        System.out.println("Updated Queue: " + numbers);

        // Creating Deque using the ArrayDeque class
        Deque<Integer> numbers2 = new ArrayDeque<>();

        // add elements to the Deque
        numbers2.offer(1);
        numbers2.offerLast(2);
        numbers2.offerFirst(3);
        System.out.println("Deque: " + numbers2);

        // Access elements of the Deque
        int firstElement = numbers2.peekFirst();
        System.out.println("First Element: " + firstElement);

        int lastElement = numbers2.peekLast();
        System.out.println("Last Element: " + lastElement);

        // Remove elements from the Deque
        int removedNumber1 = numbers2.pollFirst();
        System.out.println("Removed First Element: " + removedNumber1);

        int removedNumber2 = numbers2.pollLast();
        System.out.println("Removed Last Element: " + removedNumber2);

        System.out.println("Updated Deque: " + numbers);
    }
}

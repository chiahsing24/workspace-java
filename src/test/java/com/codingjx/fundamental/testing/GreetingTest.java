package com.codingjx.fundamental.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    @Test
    void helloWorld() {
        Greeting greeing = new Greeting();
        System.out.println(greeing.helloWorld());
    }

    @Test
    void testHelloWorld() {
        Greeting greeing = new Greeting();
        System.out.println(greeing.helloWorld("John"));
    }
}
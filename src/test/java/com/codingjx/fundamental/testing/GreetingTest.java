package com.codingjx.fundamental.testing;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {
    Greeting greeting;

    @BeforeAll
    public static void beforeClass() {
        System.out.println("@BeforeAll -- I am only called once!");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("@AfterAll -- I am only called once!");
    }

    @BeforeEach
    void setUp() {
        greeting = new Greeting();
    }

    @AfterEach
    void tearDown() {
        System.out.println("@AfterEach -- I am called every time!");
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("John"));
    }
}
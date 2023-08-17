package com.codingjx.fundamental.test.terrymartin.guessinggame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessingGameTest {

    private GuessingGame game;

    @BeforeEach
    void setUp() {
        game = new GuessingGame();
    }

    @Test
    public void testSimpleWinSituation() {
        int randomNum = game.getRandomNumber();
        String message = game.guess(randomNum);
        assertEquals("You got it", message);
    }

    @Test
    public void testOneWrongNegGuessSituation() {
        String message = game.guess(-5);
        assertEquals("You didn'd get it", message);
    }

    @Test
    public void testOnePositiveGuessSituation() {
        int randomNum = game.getRandomNumber();
        String message = game.guess(randomNum + 1);
        assertEquals("You didn'd get it", message);
    }

    @Test
    public void testRandomNumberGeneration() {
        int[] rndNumCount = new int[11];
        for (int counter = 0; counter < 100; counter++) {
            GuessingGame localGame = new GuessingGame();
            int randomNum = localGame.getRandomNumber();
            rndNumCount[randomNum] = 1;
        }

        int sum = 0;
        for (int counter = 0; counter < 11; counter++) {
            sum = sum + rndNumCount[counter];
        }

        assertEquals(10, sum);
    }

}

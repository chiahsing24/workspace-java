package com.codingjx.fundamental.test.terrymartin.calculator;

import com.codingjx.fundamental.test.terrymartin.calculator.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    public void canAddZeroPlusZero() {
        int sum = calc.add(0, 0);
        assertEquals(0, sum);
    }

    @Test
    public void canAddOnePlusOne() {
        int sum = calc.add(1, 1);
        assertEquals(sum, 2);
    }

    @Test
    public void canAddMaxIntPlusOne() {
        int sum = calc.add(Integer.MAX_VALUE, 1);
        assertEquals(Integer.MAX_VALUE + 1L, sum);
    }
}

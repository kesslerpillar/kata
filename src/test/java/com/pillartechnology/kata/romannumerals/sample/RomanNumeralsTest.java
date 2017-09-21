package com.pillartechnology.kata.romannumerals.sample;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {

    @Test
    public void testOneEqualsI() {
        assertEquals("I", RomanNumerals.convert(1));
    }

    @Test
    public void testTwoEqualsIi() {
        assertEquals("II", RomanNumerals.convert(2));
    }

    @Test
    public void testThreeEqualsIii() {
        assertEquals("III", RomanNumerals.convert(3));
    }
}

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

    @Test
    public void testFourEqualsIv() {
        assertEquals("IV", RomanNumerals.convert(4));
    }

    @Test
    public void testFiveEqualsV() {
        assertEquals("V", RomanNumerals.convert(5));
    }

    @Test
    public void testSixEqualsVi() {
        assertEquals("VI", RomanNumerals.convert(6));
    }

    @Test
    public void testSevenEqualsVii() {
        assertEquals("VII", RomanNumerals.convert(7));
    }

    @Test
    public void testEightEqualsViii() {
        assertEquals("VIII", RomanNumerals.convert(8));
    }

    @Test
    public void testNineEqualsIx() {
        assertEquals("IX", RomanNumerals.convert(9));
    }

    @Test
    public void testTenEqualsX() {
        assertEquals("X", RomanNumerals.convert(10));
    }
}

package com.pillartechnology.kata.romannumerals.sample;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {
    private RomanNumerals romanNumerals;

    @Before
    public void setUp() {
        romanNumerals = new RomanNumerals();
    }

    @Test
    public void testOneEqualsI() {
        assertEquals("I", romanNumerals.convert(1));
    }

    @Test
    public void testTwoEqualsIi() {
        assertEquals("II", romanNumerals.convert(2));
    }

    @Test
    public void testThreeEqualsIii() {
        assertEquals("III", romanNumerals.convert(3));
    }

    @Test
    public void testFourEqualsIv() {
        assertEquals("IV", romanNumerals.convert(4));
    }

    @Test
    public void testFiveEqualsV() {
        assertEquals("V", romanNumerals.convert(5));
    }

    @Test
    public void testSixEqualsVi() {
        assertEquals("VI", romanNumerals.convert(6));
    }

    @Test
    public void testSevenEqualsVii() {
        assertEquals("VII", romanNumerals.convert(7));
    }

    @Test
    public void testEightEqualsViii() {
        assertEquals("VIII", romanNumerals.convert(8));
    }

    @Test
    public void testNineEqualsIx() {
        assertEquals("IX", romanNumerals.convert(9));
    }

    @Test
    public void testTenEqualsX() {
        assertEquals("X", romanNumerals.convert(10));
    }

    @Test
    public void testElevenEqualsXi() {
        assertEquals("XI", romanNumerals.convert(11));
    }

    @Test
    public void testTwelveEqualsXii() {
        assertEquals("XII", romanNumerals.convert(12));
    }

    @Test
    public void testThirteenEqualsXiii() {
        assertEquals("XIII", romanNumerals.convert(13));
    }

    @Test
    public void testFourteenEqualsXiv() {
        assertEquals("XIV", romanNumerals.convert(14));
    }

    @Test
    public void testFifteenEqualsXv() {
        assertEquals("XV", romanNumerals.convert(15));
    }

    @Test
    public void testNineteenEqualsXix() {
        assertEquals("XIX", romanNumerals.convert(19));
    }

    @Test
    public void testThrityEightEqualsXxxvii() {
        assertEquals("XXXVIII", romanNumerals.convert(38));
    }

    @Test
    public void testThrityNineEqualsXxxix() {
        assertEquals("XXXIX", romanNumerals.convert(39));
    }

    @Test
    public void testFiftyEqualsL() {
        assertEquals("L", romanNumerals.convert(50));
    }

    @Test
    public void testFiftyFourEqualsL() {
        assertEquals("LIV", romanNumerals.convert(54));
    }

    @Test
    public void testSixtyNineEqualsL() {
        assertEquals("LXIX", romanNumerals.convert(69));
    }

    @Test
    public void testSeventyFourEqualsL() {
        assertEquals("LXXIV", romanNumerals.convert(74));
    }

    @Test
    public void testSeventyEightEqualsL() {
        assertEquals("LXXVIII", romanNumerals.convert(78));
    }

    @Test
    public void testNinetyEqualsL() {
        assertEquals("XC", romanNumerals.convert(90));
    }


    /*
         78  : '', 90: 'XC',
         99  : 'XCIX', 100: 'C',
         444 : 'CDXLIV', 500: 'D',
         667 : 'DCLXVII', 900: 'CM',
         944 : 'CMXLIV', 1000: 'M',
         1444: 'MCDXLIV', 3999: 'MMMCMXCIX',
     */
}

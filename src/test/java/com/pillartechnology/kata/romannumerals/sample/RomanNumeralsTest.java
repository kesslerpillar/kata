package com.pillartechnology.kata.romannumerals.sample;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {

    @Test
    public void testPlaceholder(){
        assertEquals("", RomanNumerals.convert(1));
    }
}

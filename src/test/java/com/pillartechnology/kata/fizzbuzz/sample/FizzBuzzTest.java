package com.pillartechnology.kata.fizzbuzz.sample;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void testOneEqualsStringOne(){
        assertEquals("1", FizzBuzz.convert(1));
    }
}

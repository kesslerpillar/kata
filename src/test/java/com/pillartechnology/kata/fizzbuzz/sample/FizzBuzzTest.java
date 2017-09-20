package com.pillartechnology.kata.fizzbuzz.sample;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void testOneEqualsStringOne(){
        assertEquals("1", FizzBuzz.convert(1));
    }

    @Test
    public void testTwoEqualsStringTwo(){
        assertEquals("2", FizzBuzz.convert(2));
    }

    @Test
    public void testThreeEqualsFizz(){
        assertEquals("Fizz", FizzBuzz.convert(3));
    }
}

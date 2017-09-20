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

    @Test
    public void testFourEqualsStringFour(){
        assertEquals("4", FizzBuzz.convert(4));
    }

    @Test
    public void testFiveEqualsBuzz(){
        assertEquals("Buzz", FizzBuzz.convert(5));
    }

    @Test
    public void testSixEqualsBuzz(){
        assertEquals("Fizz", FizzBuzz.convert(6));
    }

    @Test
    public void testSevenEqualsStringSeven(){
        assertEquals("7", FizzBuzz.convert(7));
    }

    @Test
    public void testEightEqualsStringEight(){
        assertEquals("8", FizzBuzz.convert(8));
    }

    @Test
    public void testNineEqualsFizz(){
        assertEquals("Fizz", FizzBuzz.convert(9));
    }
}

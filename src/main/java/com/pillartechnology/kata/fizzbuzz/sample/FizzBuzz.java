package com.pillartechnology.kata.fizzbuzz.sample;

public class FizzBuzz {
    public static String convert(int number) {
        if(number == 3) return "Fizz";
        if(number == 5) return "Buzz";
        return Integer.toString(number);
    }
}

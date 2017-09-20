package com.pillartechnology.kata.fizzbuzz.sample;

public class FizzBuzz {
    public static String convert(int number) {
        if(isDivisible(number, 3)) return "Fizz";
        if(isDivisible(number, 5)) return "Buzz";
        return Integer.toString(number);
    }

    private static boolean isDivisible(int number, int by) {
        return number % by == 0;
    }
}

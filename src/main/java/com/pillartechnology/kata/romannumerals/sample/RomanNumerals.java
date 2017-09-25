package com.pillartechnology.kata.romannumerals.sample;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals {

    public static String convert(int number) {
        return traverse(number, "");
    }

    private static String traverse(int number, String romanNumeral) {
        Map<Integer, String> multiples = new LinkedHashMap<Integer, String>() {
            {
                put(10, "X");
            }
        };

        Map<Integer, String> singles = new LinkedHashMap<Integer, String>() {
            {
                put(9, "IX");
                put(5, "V");
                put(4, "IV");
            }
        };

        int before = number;
        for (Map.Entry<Integer, String> multiple : multiples.entrySet()) {
            while (number > 0 && (endsWithNumber(number, multiple.getKey()) || isEvenlyDivisible(number, multiple.getKey()))) {
                romanNumeral = multiple.getValue() + romanNumeral;
                number = number - multiple.getKey();
            }
        }

        for (Map.Entry<Integer, String> single : singles.entrySet()) {
            if (endsWithNumber(number, single.getKey())) {
                romanNumeral = single.getValue() + romanNumeral;
                number = number - single.getKey();
            }
        }

        if (before == number && number > 0) {
            romanNumeral = "I" + romanNumeral;
            number = number - 1;
        }

        if (number == 0) {
            return romanNumeral;
        }
        return traverse(number, romanNumeral);
    }

    private static boolean isEvenlyDivisible(int number, int key) {
        return number % key == 0;
    }

    private static boolean endsWithNumber(Integer number, Integer key) {
        return number.toString().endsWith(key.toString());
    }
}

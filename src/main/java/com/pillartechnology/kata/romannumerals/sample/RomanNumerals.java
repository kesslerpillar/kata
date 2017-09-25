package com.pillartechnology.kata.romannumerals.sample;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {
    private static Map<Integer, String> translation;

    static {
        translation = Collections.unmodifiableMap(new HashMap<Integer, String>() {
            {
                put(9, "IX");
                put(5, "V");
                put(4, "IV");
                put(10, "X");
                put(40, "IL");
                put(50, "L");
            }
        });
    }

    public static String convert(int number) {
        String romanNumeral = "";

        romanNumeral = processTens(number, romanNumeral);
        romanNumeral = processOnes(number, romanNumeral);

        return romanNumeral;
    }

    private static String processOnes(int number, String romanNumeral) {
        int ones = number % 10;

        if (ones >= 9) {
            romanNumeral += "IX";
            ones = ones - 9;
        }

        if (ones >= 5) {
            romanNumeral += "V";
            ones = ones - 5;
        }

        if (ones >= 4) {
            romanNumeral += "IV";
            ones = ones - 4;
        }

        for (int i = 0; i < ones; i++) {
            romanNumeral += "I";
        }
        return romanNumeral;
    }

    private static String processTens(int number, String romanNumeral) {
        int tens = number / 10 % 10;

        if (tens == 5) {
            romanNumeral += "L";
            tens = tens - 5;
        }

        if (tens == 4) {
            romanNumeral += "XL";
            tens = tens - 4;
        }

        for (int i = 0; i < tens; i++) {
            romanNumeral += "X";
        }
        return romanNumeral;
    }
}

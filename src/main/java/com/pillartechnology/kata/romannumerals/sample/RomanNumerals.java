package com.pillartechnology.kata.romannumerals.sample;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals {

    public static String convert(int number) {
        return traverse(number, "");
    }

    private static String traverse(int number, String romanNumeral) {
        Map<Integer, String> translations = new LinkedHashMap<Integer, String>() {
            {
                put(10, "X");
                put(9, "IX");
                put(5, "V");
                put(4, "IV");
            }
        };

        for (Map.Entry<Integer, String> translation : translations.entrySet()) {
            if (translation.getKey() == number) {
                romanNumeral = translation.getValue() + romanNumeral;
                number = number - translation.getKey();
            }
        }
        if (number > 0) {
            romanNumeral = "I" + romanNumeral;
            number = number - 1;
        }
        if (number == 0) {
            return romanNumeral;
        }
        return traverse(number, romanNumeral);
    }
}

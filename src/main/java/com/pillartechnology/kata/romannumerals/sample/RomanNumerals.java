package com.pillartechnology.kata.romannumerals.sample;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals {


    private static Map<Integer, String> translations;

    static {
        translations = Collections.unmodifiableMap(new LinkedHashMap<Integer, String>() {
            {
                put(5, "V");
                put(4, "IV");
            }
        });
    }

    public static String convert(int number) {
        String romanNumeral = "";
        int remainder = number;

        for (Map.Entry<Integer, String> translation : translations.entrySet()) {
            if (translation.getKey() == remainder) {
                romanNumeral = translation.getValue() + romanNumeral;
                remainder = remainder - translation.getKey();
            } else if (remainder > 0) {
                romanNumeral = "I" + romanNumeral;
                remainder = remainder - 1;
            }
        }

        return romanNumeral;
    }
}

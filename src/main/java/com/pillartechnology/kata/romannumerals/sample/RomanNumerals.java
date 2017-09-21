package com.pillartechnology.kata.romannumerals.sample;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {


    private static Map<Integer, String> translation;

    static {
        translation = Collections.unmodifiableMap(new HashMap<Integer, String>() {
            {
                put(1, "I");
                put(2, "II");
                put(3, "III");
                put(4, "IV");
                put(5, "V");
            }
        });
    }

    public static String convert(int number) {
        return translation.get(number);
    }
}

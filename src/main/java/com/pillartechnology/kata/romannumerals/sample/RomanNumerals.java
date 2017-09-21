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
        String base = "";
        String percision = "";

        if (number > 5) {
            base = translation.get(5);
            percision = translation.get(number - 5);
        } else {
            base = translation.get(number);
        }
        return base + percision;
    }
}

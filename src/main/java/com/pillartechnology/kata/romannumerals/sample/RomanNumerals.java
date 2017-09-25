package com.pillartechnology.kata.romannumerals.sample;

import java.util.Arrays;
import java.util.List;

public class RomanNumerals {

    private List<Conversion> conversions;

    public RomanNumerals() {
        conversions = Arrays.asList(new Conversion(1000, "M", 1000), new Conversion(900, "CM", 100),
                new Conversion(500, "D", 100), new Conversion(400, "CD", 100), new Conversion(100, "C", 100),
                new Conversion(90, "XC", 10), new Conversion(50, "L", 10), new Conversion(40, "XL", 10),
                new Conversion(10, "X", 10), new Conversion(9, "IX", 1), new Conversion(5, "V", 1),
                new Conversion(4, "IV", 1), new Conversion(1, "I", 1));
    }

    public String convert(int number) {
        Builder romanNumeral = new Builder(number, "");
        for (Conversion conversion : conversions) {
            append(romanNumeral, conversion);
        }

        return romanNumeral.toString();
    }


    private void append(Builder builder, Conversion conversion) {
        while (builder.count(conversion.range) >= (conversion.number / conversion.range)) {
            builder.append(conversion.romanNumeral);
            builder.subtract(conversion.number);
        }
    }

    private class Builder {
        private int number;
        private String romanNumeral;

        private Builder(int number, String romanNumeral) {
            this.number = number;
            this.romanNumeral = romanNumeral;
        }

        private void subtract(int value) {
            number = number - value;
        }

        private void append(String part) {
            romanNumeral += part;
        }

        private int count(int amount) {
            return number / amount % 10;
        }

        @Override
        public String toString() {
            return romanNumeral;
        }
    }

    private class Conversion {

        private int number;
        private String romanNumeral;
        private int range;

        private Conversion(int number, String romanNumeral, int range) {
            this.number = number;
            this.romanNumeral = romanNumeral;
            this.range = range;
        }

        public int getNumber() {
            return number;
        }

        public String getRomanNumeral() {
            return romanNumeral;
        }

        public int getRange() {
            return range;
        }
    }
}

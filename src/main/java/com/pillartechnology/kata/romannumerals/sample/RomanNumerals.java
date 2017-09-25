package com.pillartechnology.kata.romannumerals.sample;

public class RomanNumerals {

    public String convert(int number) {
        Builder romanNumeral = new Builder(number, "");

        processBase(romanNumeral, new Conversion(1000, "M", 1000));

        append(romanNumeral, new Conversion(900, "CM", 100));
        append(romanNumeral, new Conversion(500, "D", 100));
        append(romanNumeral, new Conversion(400, "CD", 100));

        processBase(romanNumeral, new Conversion(100, "C", 100));

        append(romanNumeral, new Conversion(90, "XC", 10));
        append(romanNumeral, new Conversion(50, "L", 10));
        append(romanNumeral, new Conversion(40, "XL", 10));

        processBase(romanNumeral, new Conversion(10, "X", 10));

        append(romanNumeral, new Conversion(9, "IX", 1));
        append(romanNumeral, new Conversion(5, "V", 1));
        append(romanNumeral, new Conversion(4, "IV", 1));

        processBase(romanNumeral, new Conversion(1, "I", 1));

        return romanNumeral.toString();
    }


    private void append(Builder builder, Conversion conversion) {
        if (builder.count(conversion.range) >= (conversion.number / conversion.range)) {
            builder.append(conversion.romanNumeral);
            builder.subtract(conversion.number);
        }
    }

    private void processBase(Builder builder, Conversion conversion) {
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

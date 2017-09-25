package com.pillartechnology.kata.romannumerals.sample;

public class RomanNumerals {

    public String convert(int number) {
        RomanNumberal romanNumeral = new RomanNumberal(number, "");

        romanNumeral = processTens(romanNumeral);
        romanNumeral = processOnes(romanNumeral);

        return romanNumeral.toString();
    }

    private RomanNumberal processOnes(RomanNumberal romanNumberal) {

        if (romanNumberal.ones() >= 9) {
            romanNumberal.append("IX");
            romanNumberal.subtract(9);
        }

        if (romanNumberal.ones() >= 5) {
            romanNumberal.append("V");
            romanNumberal.subtract(5);
        }

        if (romanNumberal.ones() >= 4) {
            romanNumberal.append("IV");
            romanNumberal.subtract(4);
        }

        while (romanNumberal.ones() > 0) {
            romanNumberal.append("I");
            romanNumberal.subtract(1);
        }
        return romanNumberal;
    }

    private RomanNumberal processTens(RomanNumberal romanNumberal) {
        if (romanNumberal.tens() >= 5) {
            romanNumberal.append("L");
            romanNumberal.subtract(50);
        }

        if (romanNumberal.tens() >= 4) {
            romanNumberal.append("XL");
            romanNumberal.subtract(40);
        }

        while (romanNumberal.tens() > 0) {
            romanNumberal.append("X");
            romanNumberal.subtract(10);
        }
        return romanNumberal;
    }

    private class RomanNumberal {
        private int number;
        private String romanNumeral;

        private RomanNumberal(int number, String romanNumeral) {
            this.number = number;
            this.romanNumeral = romanNumeral;
        }

        private void subtract(int value) {
            number = number - value;
        }

        private void append(String part) {
            romanNumeral += part;
        }

        private int tens() {
            return number / 10 % 10;
        }

        private int ones() {
            return number % 10;
        }

        @Override
        public String toString() {
            return romanNumeral;
        }
    }
}

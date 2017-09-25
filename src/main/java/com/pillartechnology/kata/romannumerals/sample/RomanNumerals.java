package com.pillartechnology.kata.romannumerals.sample;

public class RomanNumerals {

    public String convert(int number) {
        RomanNumberal romanNumeral = new RomanNumberal(number, "");

        romanNumeral = processTens(romanNumeral);
        romanNumeral = processOnes(romanNumeral);

        return romanNumeral.toString();
    }

    private RomanNumberal processOnes(RomanNumberal romanNumberal) {
        appendOnes(romanNumberal, 9, "IX");
        appendOnes(romanNumberal, 5, "V");
        appendOnes(romanNumberal, 4, "IV");

        while (romanNumberal.ones() > 0) {
            romanNumberal.append("I");
            romanNumberal.subtract(1);
        }
        return romanNumberal;
    }

    private RomanNumberal processTens(RomanNumberal romanNumberal) {
        appendTens(romanNumberal, 90, "XC");
        appendTens(romanNumberal, 50, "L");
        appendTens(romanNumberal, 40, "XL");

        while (romanNumberal.tens() > 0) {
            romanNumberal.append("X");
            romanNumberal.subtract(10);
        }
        return romanNumberal;
    }


    private void appendOnes(RomanNumberal romanNumberal, int number, String numeral) {
        if (romanNumberal.ones() >= (number)) {
            romanNumberal.append(numeral);
            romanNumberal.subtract(number);
        }
    }

    private void appendTens(RomanNumberal romanNumberal, int number, String numeral) {
        if (romanNumberal.tens() >= (number / 10)) {
            romanNumberal.append(numeral);
            romanNumberal.subtract(number);
        }
    }


    private void append(RomanNumberal romanNumberal, int number, String numeral, int divisor) {

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

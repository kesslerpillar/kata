package com.pillartechnology.kata.romannumerals.sample;

public class RomanNumerals {

    public String convert(int number) {
        RomanNumberal romanNumeral = new RomanNumberal(number, "");

        romanNumeral = processThousands(romanNumeral);
        romanNumeral = processHundreds(romanNumeral);
        romanNumeral = processTens(romanNumeral);
        romanNumeral = processOnes(romanNumeral);

        return romanNumeral.toString();
    }

    private RomanNumberal processOnes(RomanNumberal romanNumberal) {
        append(romanNumberal, 9, "IX", 1);
        append(romanNumberal, 5, "V", 1);
        append(romanNumberal, 4, "IV", 1);

        while (romanNumberal.count(1) > 0) {
            romanNumberal.append("I");
            romanNumberal.subtract(1);
        }
        return romanNumberal;
    }

    private RomanNumberal processTens(RomanNumberal romanNumberal) {
        append(romanNumberal, 90, "XC", 10);
        append(romanNumberal, 50, "L", 10);
        append(romanNumberal, 40, "XL", 10);

        while (romanNumberal.count(10) > 0) {
            romanNumberal.append("X");
            romanNumberal.subtract(10);
        }
        return romanNumberal;
    }

    private RomanNumberal processHundreds(RomanNumberal romanNumberal) {
        append(romanNumberal, 900, "CM", 100);
        append(romanNumberal, 500, "D", 100);
        append(romanNumberal, 400, "CD", 100);

        while (romanNumberal.count(100) > 0) {
            romanNumberal.append("C");
            romanNumberal.subtract(100);
        }
        return romanNumberal;
    }

    private RomanNumberal processThousands(RomanNumberal romanNumberal) {
        while (romanNumberal.count(1000) > 0) {
            romanNumberal.append("M");
            romanNumberal.subtract(1000);
        }
        return romanNumberal;
    }


    private void append(RomanNumberal romanNumberal, int number, String numeral, int amountToCount) {
        if (romanNumberal.count(amountToCount) >= (number / amountToCount)) {
            romanNumberal.append(numeral);
            romanNumberal.subtract(number);
        }
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

        private int count(int amount) {
            return number / amount % 10;
        }

        @Override
        public String toString() {
            return romanNumeral;
        }
    }
}

package com.pillartechnology.kata.romannumerals.sample;

public class RomanNumerals {

    public String convert(int number) {
        Builder romanNumeral = new Builder(number, "");

        romanNumeral = processThousands(romanNumeral);
        romanNumeral = processHundreds(romanNumeral);
        romanNumeral = processTens(romanNumeral);
        romanNumeral = processOnes(romanNumeral);

        return romanNumeral.toString();
    }

    private Builder processOnes(Builder builder) {
        append(builder, new Conversion(9, "IX", 1));
        append(builder, new Conversion(5, "V", 1));
        append(builder, new Conversion(4, "IV", 1));

        while (builder.count(1) > 0) {
            builder.append("I");
            builder.subtract(1);
        }
        return builder;
    }

    private Builder processTens(Builder builder) {
        append(builder, new Conversion(90, "XC", 10));
        append(builder, new Conversion(50, "L", 10));
        append(builder, new Conversion(40, "XL", 10));

        while (builder.count(10) > 0) {
            builder.append("X");
            builder.subtract(10);
        }
        return builder;
    }

    private Builder processHundreds(Builder builder) {
        append(builder, new Conversion(900, "CM", 100));
        append(builder, new Conversion(500, "D", 100));
        append(builder, new Conversion(400, "CD", 100));

        while (builder.count(100) > 0) {
            builder.append("C");
            builder.subtract(100);
        }
        return builder;
    }

    private Builder processThousands(Builder builder) {
        while (builder.count(1000) > 0) {
            builder.append("M");
            builder.subtract(1000);
        }
        return builder;
    }


    private void append(Builder builder, Conversion conversion) {
        if (builder.count(conversion.range) >= (conversion.number / conversion.range)) {
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

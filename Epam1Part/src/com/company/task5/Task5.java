package com.company.task5;

public class Task5 {

    private static int hundreds, tens, units;

    private static int getSum() {
        return hundreds + tens + units;
    }

    private static int getMul() {
        return hundreds * tens * units;

    }

    private static int getNumHunsAndTensSwapped() {
        return tens * 100 + hundreds * 10 + units;
    }

    private static int getNumThousandAdded() {
        return units * 1000 + hundreds * 100 + tens * 10 + units;

    }

    private static void divideNumByParts(int num) {
        hundreds = num / 100;
        tens = num % 100 / 10;
        units = num % 10;
    }

    public static void main(String[] args) {
        int number = 123;
        divideNumByParts(number);

        System.out.printf("1. Sum: %d, Mul: %d\n", getSum(), getMul());
        System.out.printf("2. Swapped: %d\n", getNumHunsAndTensSwapped());
        System.out.printf("3. 4-digits num: %d", getNumThousandAdded());
    }
}

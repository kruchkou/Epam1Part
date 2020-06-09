package com.company.task5;

public class Task5 {

    private static int getSum(int num) {
        return getHundreds(num) + getTens(num) + getUnits(num);
    }

    private static int getMul(int num) {
        return getHundreds(num) * getTens(num) * getUnits(num);

    }

    private static int getNumHunsAndTensSwapped(int num) {
        return getTens(num) * 100 + getHundreds(num) * 10 + getUnits(num);
    }

    private static int getNumThousandAdded(int num) {
        return getUnits(num) * 1000 + getHundreds(num) * 100 + getTens(num) * 10 + getUnits(num);
    }

    private static int getHundreds(int num) {
        return num / 100;
    }

    private static int getTens(int num) {
        return num % 100 / 10;

    }

    private static int getUnits(int num) {
        return num % 10;
    }

    public static void main(String[] args) {
        int num = 123;

        System.out.printf("1. Sum: %d, Mul: %d\n", getSum(num), getMul(num));
        System.out.printf("2. Swapped: %d\n", getNumHunsAndTensSwapped(num));
        System.out.printf("3. 4-digits num: %d", getNumThousandAdded(num));
    }
}

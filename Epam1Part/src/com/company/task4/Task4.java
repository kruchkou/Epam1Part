package com.company.task4;

public class Task4 {

    private static double getResult(double x) {
        if (x > 13) {
            return -(3 / (x + 1));
        } else {
            return -(x * x * x) + 9;
        }
    }

    public static void main(String[] args) {
        double x = 14;
        System.out.printf("Result is: %f", getResult(x));
    }
}

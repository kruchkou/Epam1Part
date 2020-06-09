package com.company.task1;

public class Task1 {

    private static double getResult(double a, double b, double c) {
        return (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - a * a * a * c + 1 / (b * b);
    }

    public static void main(String[] args) {
        double a = -2;
        double b = 5;
        double c = 2;
        System.out.printf("Result is: %f", getResult(a, b, c));
    }
}


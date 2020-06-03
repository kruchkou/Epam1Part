package com.company.task3;

public class Task3 {

    private static double a,b,c;

    private static void calculate() {
        if (a > b && b > c) {
            a = a * 2;
            b = b * 2;
            c = c * 2;
        } else {
            a = Math.abs(a);
            b = Math.abs(b);
            c = Math.abs(c);
        }
    }

    public static void main(String[] args) {
        a = 6;
        b = 5;
        c = 4;
        calculate();
        System.out.printf("A = %f, B = %f, C = %f", a, b, c);
    }
}

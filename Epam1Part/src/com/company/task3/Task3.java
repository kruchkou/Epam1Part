package com.company.task3;

//Не использовал бы массивы, если бы не необходимость иметь более 1-го метода
//Или глобальные переменные, но так читабельность лучше

public class Task3 {

    private static double[] getTransformedABC(double a, double b, double c) {

        if (a > b && b > c) {
            a = a * 2;
            b = b * 2;
            c = c * 2;
        } else {
            a = Math.abs(a);
            b = Math.abs(b);
            c = Math.abs(c);
        }

        return new double[]{a, b, c};
    }

    public static void main(String[] args) {
        final int A_POS = 0;
        final int B_POS = 1;
        final int C_POS = 2;

        double a = 6;
        double b = 5;
        double c = 4;

        double[] abc = getTransformedABC(a,b,c);

        a = abc[A_POS];
        b = abc[B_POS];
        c = abc[C_POS];

        System.out.printf("A = %f, B = %f, C = %f", a, b, c);
    }
}

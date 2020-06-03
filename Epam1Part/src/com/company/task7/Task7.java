package com.company.task7;

public class Task7 {

    private static double getResult(double number) {
        return number * 1000 % 1000 + (int) number / 1000.0;
    }


    public static void main(String[] args) {
        double number = 123.456;

        System.out.printf("Result = %f",getResult(number));

    }
}

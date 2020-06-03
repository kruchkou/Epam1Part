package com.company.task8;

import java.util.ArrayList;

public class Task8 {

    private static ArrayList<Double> getResult(double a, double b, double h, double c) {
        ArrayList<Double> results = new ArrayList<>();
        for (double x = a; x <= b; x += h) {
            if (x == 15) {
                results.add((x + c) * 2);
            } else {
                results.add((x - c) + 6);
            }
        }
        return results;
    }

    public static void main(String[] args) {
        double a = 14, b = 16, h = 1, c = 5;

        System.out.println(getResult(a, b, h, c));
    }
}

package com.company.task9;

public class Task9 {

    private static long getResult() {
        int sum = 1;
        long mul = 1;
        for (int index = 2; index <= 10; index++) {
            sum += index;
            mul *= sum;
        }
        return mul;
    }

    public static void main(String[] args) {
        System.out.println("Result = "+getResult());
    }
}

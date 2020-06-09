package com.company.task10;

import java.util.Scanner;

public class Task10 {

    private static boolean isRaising = true;
    private static boolean hasSameNumsNear = false;
    private static boolean isAlternating = true;
    private static int prevNumber = 0;

    private static void checkNumber(int number) {

        if (prevNumber == number) {
            hasSameNumsNear = true;
        }
        if (number < prevNumber) {
            isRaising = false;
        }
        if ((prevNumber > 0 && number > 0) || (prevNumber < 0 && number < 0)) {
            isAlternating = false;
        }
        prevNumber = number;
    }

    private static void inputNumbers() {

        int number;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input numbers by ENTER:");

        while (true) {
            number = sc.nextInt();
            if (number == 0) {
                break;
            } else {
                checkNumber(number);
            }
        }
    }

    public static void main(String[] args) {

        inputNumbers();

        System.out.println("Is Raising: " + isRaising);
        System.out.println("Has same nums near: " + hasSameNumsNear);
        System.out.println("Is alternating: " + isAlternating);
    }
}

package com.company.task2;

public class Task2 {

    private static int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private static String getDataFromDay(int day) {

        int month;
        for (month = 0; day > daysInMonths[month]; month++) {
            day -= daysInMonths[month];
        }
        return "Day: " + day + " Month: " + month;
    }

    public static void main(String[] args) {
        int day = 365;
        System.out.println(getDataFromDay(day));
    }
}

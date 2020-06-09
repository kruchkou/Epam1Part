package com.company.task2;

public class Task2 {

    private static int getDaysInMonth(int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;

            case 4:
            case 6:
            case 9:
            case 11:
                return 30;

            case 2:
                return 28;
        }
        return 0;
    }

    private static String getDataFromDay(int day) {
        int month;

        for (month = 1; day > getDaysInMonth(month); month++) {
            day -= getDaysInMonth(month);
        }
        return "Day: " + day + " Month: " + month;
    }

    public static void main(String[] args) {
        int day = 31;
        System.out.println(getDataFromDay(day));
    }
}


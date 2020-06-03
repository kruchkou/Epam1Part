package com.company.task6;

public class Task6 {

    private static int getMaxValueForInt(int a1, int d) {
        int an = a1;
        int n = 1;
        int prevSum = a1, currSum = a1;
        while (true) {
            an += d;
            n++;
            currSum += an;
            if (d > 0) {
                if (prevSum > currSum && prevSum > 0) {
                    break;
                }
            } else {
                if (prevSum < currSum && prevSum < 0) {
                    break;
                }
            }
            prevSum = currSum;
        }
        return n;
    }

    private static long getMaxValueForLong(int a1, int d) {
        long an = a1;
        long n = 1;
        long prevSum = a1, currSum = a1;
        while (true) {
            an += d;
            n++;
            currSum += an;
            if (d > 0) {
                if (prevSum > currSum && prevSum > 0) {
                    break;
                }
            } else {
                if (prevSum < currSum && prevSum < 0) {
                    break;
                }
            }
            prevSum = currSum;
        }
        return n;
    }

    public static void main(String[] args) {
        int a1 = 12;
        int d = -31;

        System.out.println(getMaxValueForInt(a1, d));
        System.out.println(getMaxValueForLong(a1, d));
    }
}

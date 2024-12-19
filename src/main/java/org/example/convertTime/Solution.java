package org.example.convertTime;

class Solution {
    public int convertTime(String current, String correct) {
        // Algorithm used
        // convert both times to minutes
        // find the difference in minutes
        // divide the difference by 60,15, 5, 1
        // add the quotient to the number of steps
        // find the remainder
        // repeat the process with the remainder
        // return the number of steps


        int currentMinutes = convertToMinutes(current);
        int correctMinutes = convertToMinutes(correct);
        int difference = correctMinutes - currentMinutes;

        int steps = 0;
        int[] divisors = {60, 15, 5, 1};
        for (int divisor : divisors) {
            steps += difference / divisor;
            difference = difference % divisor;
        }
        return steps;

    }

    private int convertToMinutes(String current) {
        String[] time = current.split(":");
        return Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);

    }
}
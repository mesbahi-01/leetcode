package org.example.convertTime;

class Solution {
    public int convertTime(String current, String correct) {
        // Algorithm used
        // 1. Parse the current and correct time to get the hours and minutes
        // 2. Calculate the difference in hours and minutes
        // 3. Calculate the number of steps needed to reach the correct time
        // 4. Return the number of steps

        // for Step 3
        // 1. Calculate the number of steps needed to reach the correct hours
        // 2. Calculate the number of steps needed to reach the correct minutes
            // if the difference in minutes is negative, add 60 to the difference in minutes and subtract 1 from the difference in hours
        // 3. Return the sum of the steps needed to reach the correct hours and minutes


        // "09:41" ; 53 15*3 + 5*1 + 1*3 ; "10:34" => 7
        int numberOfSteps = 0;
        int currentHours = Integer.parseInt(current.substring(0, 2));
        int correctHours = Integer.parseInt(correct.substring(0, 2));

        int currentMinutes = Integer.parseInt(current.substring(3));
        int correctMinutes = Integer.parseInt(correct.substring(3));

        int differenceInHours = correctHours - currentHours;

        int differenceInMinutes = correctMinutes - currentMinutes;

        if (differenceInMinutes < 0){
            differenceInMinutes += 60;
            differenceInHours -=1;
        }

        numberOfSteps += differenceInHours ;

        int[] allowedSteps = {1, 5, 15};
        int currentIndex = allowedSteps.length - 1;

        while (differenceInMinutes != 0) {
            numberOfSteps += differenceInMinutes / allowedSteps[currentIndex];
            differenceInMinutes = differenceInMinutes % allowedSteps[currentIndex--];
        }

        return numberOfSteps;
    }
}
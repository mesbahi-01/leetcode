package org.example.maxNumberOfBalloons;

class Solution {
    public int maxNumberOfBalloons(String text) {
        // calculate the frequency of chars in balloon
        // calculate the frequency of chars in text
        // maxNumberOfBalloons equals the maximum possible number of balloons that can be formed
        // foreach char in "balloon"
        // calculate frequency_text[char[i]] / frequency_balloon[char[i]]
        // maxNumberOfBalloons = min(calculated_frequency,maxNumberOfBalloons)
        // return maxNumberOfBalloons

        int[] frequency_balloon = new int[128];
        int[] frequency_text = new int[128];
        String balloon = "balloon";
        for (int i = 0; i < balloon.length(); i++) {
            frequency_balloon[balloon.charAt(i)]++;
        }
        for (int i = 0; i < text.length(); i++) {
            frequency_text[text.charAt(i)]++;
        }
        int maxNumberOfBalloons = Integer.MAX_VALUE;
        for (int i = 0; i < balloon.length(); i++) {
            maxNumberOfBalloons = Math.min(frequency_text[balloon.charAt(i)] / frequency_balloon[balloon.charAt(i)], maxNumberOfBalloons);
            if (maxNumberOfBalloons == 0) return 0;
        }
        return maxNumberOfBalloons;

    }
}
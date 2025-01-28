package org.example.closeTarget;

class Solution {
    public static void main(String args[]) {
        new Solution()
                .closetTarget(new String[]{"a", "b", "leetcode"}, "leetcode", 0);
    }

    public int closetTarget(String[] words, String target, int startIndex) {
        // minimum steps to reach target in words = +infinity
        // circle from startIndex from left to right
        // if target == words[i]
        // minimumSteps = min(minimumSteps,abs(startIndex - i))

        // circle from startIndex from right to left
        // if target == words[i]
        // minimumSteps = min(minimumSteps,abs(startIndex - i))
        // if minimumSteps== +infinity return -1 else return minimumSteps

        Integer minimumSteps = -1;
        int i = startIndex;
        int stepsCounter = 0;
        do {
            if (target.equals(words[i])) {
                if (minimumSteps == -1) minimumSteps = stepsCounter;
                else {
                    minimumSteps = Math.min(minimumSteps,
                            stepsCounter);
                }
            }
            i = (i + 1) % words.length;
            stepsCounter++;
        } while (i != startIndex);

        if (minimumSteps == -1) return minimumSteps;

        i = startIndex;
        stepsCounter = 0;

        do {
            i = (i - 1 + words.length) % words.length;
            stepsCounter++;
            if (target.equals(words[i])) {
                minimumSteps = Math.min(minimumSteps, stepsCounter);
            }
        } while (i != startIndex);

        return minimumSteps;
    }
}
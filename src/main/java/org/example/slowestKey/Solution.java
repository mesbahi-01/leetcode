package org.example.slowestKey;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] releaseTimes = {9, 29, 49, 50};
        String keysPressed = "cbcd";
        System.out.println(solution.slowestKey(releaseTimes, keysPressed));
    }
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int previousStepOfTime = 0;
        int indexOFSlowestKey = -1;
        int largestDuration = Integer.MIN_VALUE;

        for (int i = 0; i < keysPressed.length(); i++) {
            int duration = releaseTimes[i] - previousStepOfTime;
            if (duration > largestDuration) {
                indexOFSlowestKey = i;
                largestDuration = duration;
            }
            else if (duration == largestDuration) {
                indexOFSlowestKey = keysPressed.charAt(indexOFSlowestKey) > keysPressed.charAt(i) ?
                        indexOFSlowestKey : i;
            }
            previousStepOfTime = releaseTimes[i];
        }
        return keysPressed.charAt(indexOFSlowestKey);
    }
}
package org.example.maxRepeating;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxRepeating("ababc", "ab"));
    }
    public int maxRepeating(String sequence, String word) {
        int maximumRepeating = 0;
        int counter = 0;
        for (int i = 0; i < sequence.length(); ) {
            int k = 0;
            while(k < word.length() && i + k < sequence.length() && word.charAt(k) == sequence.charAt(i + k)) k++;

            if (k == word.length()) {
                counter++;
                maximumRepeating = Math.max(counter,maximumRepeating);
                i += word.length();
            }else {
                counter = 0;
                i++;
            }
        }
        return maximumRepeating;
    }
}
package org.example.minimumRecolors;

class Solution {
    public int minimumRecolors(String blocks, int k) {
        // 1 start with a minimumRecolors equals to the maximum possible number
        // 2 count numberOfWhits in a substring equals to k in length
        // 3 minimumRecolors = min(minimumRecolors,numberOfWhites)
        // 4 move the window one step and update minimumRecolors
        // 5 repeat 3 while the end of blocks has not been reached.

        int minimumRecolors = Integer.MAX_VALUE;

        int numberOfWhits = 0;

        for(int i = 0; i < k; i++){
            if(blocks.charAt(i) == 'W'){
                numberOfWhits++;
            }
        }

        minimumRecolors = Math.min(minimumRecolors, numberOfWhits);

        for (int i = k, j = 0; i < blocks.length() && numberOfWhits != 0; i++,j++) {

            if (blocks.charAt(j) == 'W'){
                numberOfWhits--;
            }

            if (blocks.charAt(i) == 'W'){
                numberOfWhits++;
            }

            minimumRecolors = Math.min(minimumRecolors, numberOfWhits);
        }

        return minimumRecolors;

    }

    private int countchar(String substring, char w) {
        int counter = 0;
        for (char c :
                substring.toCharArray()) {
            if (c == w) counter++;
        }
        return counter;
    }
}
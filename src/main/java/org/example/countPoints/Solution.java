package org.example.countPoints;

class Solution {
    public static void main(String[] arg){
        Solution s = new Solution();
        s.countPoints("B0B6G0R6R0R6G9");
    }
    public int countPoints(String rings) {
        int[][] rod_rgb = new int[9][3];

        for (int i = 0; i < rings.length() ; i+=2) {

            int color_index = switch (rings.charAt(i)){
                case 'R' -> 0;
                case 'G' -> 1;
                default -> 2;
            };

            int rod_index = rings.charAt(i + 1) - '0';

            rod_rgb[rod_index][color_index]++;
        }// A0B0G0

        int counter = 0;

        for (int i = 0; i < rod_rgb.length; i++) {
            boolean foundRGB = true;
            for (int j = 0; j < 3; j++) {
                if (rod_rgb[i][j] == 0){
                    foundRGB = false;
                    break;
                }
            }
            if (foundRGB) counter++;
        }
        return counter;
    }
}
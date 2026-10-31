package org.example.trap;

public class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length;

        if (right < 2) {
            return 0;
        }


        int result = 0;

        int maxLeftBarier = height[0];
        int maxRightBarier = height[right];

        while (left < right) {
            if (maxLeftBarier <= maxRightBarier) {
                left++;
                maxLeftBarier = Math.max(height[left], maxLeftBarier);
                result += maxLeftBarier - height[left];

            }else{
                right--;
                maxRightBarier = Math.max(height[right], maxRightBarier);
                result+= maxRightBarier - height[right];
            }
        }

        return result;
    }
}

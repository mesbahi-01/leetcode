package org.example.productExceptSelf;

import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = nums[0];

        for (int i = 1; i < nums.length; i++) {
            product *= nums[i];
        }

        int numberOfZeros = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) numberOfZeros++;
            if (numberOfZeros == 2) break;
        }

        // found number of zeros more than 2
        // everything is 0 in output array

        int[] output = new int[nums.length];

        int newProduct = 0;

        if (numberOfZeros > 1) {
            Arrays.fill(output, 0);
            return output;
        } else if (numberOfZeros == 1) {
            newProduct = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != 0) newProduct *= nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                output[i] = newProduct;
            } else {
                output[i] = product / nums[i];
            }
        }
        return output;
    }
}  

package org.example.maximumPrimeDifference;

public class Solution {
    // start with two pointers p1 and p2;
    //      initialize them with -1
    //      # p1 always points to the first found prim number
    //      # p2 to the first or last found one
    // loop from the beginning to the first prim number
    //      if nums[i] is prime number do the following :
    //          set p1 and p2 to index and break the loop

    // if you reach the end of the loop or p1 did not change,
    //        // it means there is no prim-number

    //  from p1 to the end of nums
    //      if nums[i] is prime number do the following:
    //          set p2 to index
    // if p1 and p2 greater than 0 return p2 - p1
    public int maximumPrimeDifference(int[] nums) {
        if (nums.length < 2) return 0;

        int p1 = -1, p2 = -1;

        for (int index = 0; index < nums.length; index++) {
            if (isPrime(nums[index])) {
                p1 = index;
                p2 = p1;
                break;
            }
        }

        if (p1 == -1) return 0;

        for (int right = nums.length - 1; p1 < right; right--) {
            if (isPrime(nums[right])) {
                p2 = right;
                break;
            }
        }
        return p2 - p1;
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

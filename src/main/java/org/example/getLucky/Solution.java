package org.example.getLucky;

class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        int iiii = s.getLucky("dbvmfhnttvr", 5);
        System.out.println(iiii);
    }

    public int getLucky(String s, int k) {
        // Convert the string to a number by summing digit values
        int currentNumber = 0;
        for (char ch : s.toCharArray()) {
            int position = ch - 'a' + 1;
            while (position > 0) {
                currentNumber += position % 10;
                position /= 10;
            }
        }

        // Apply digit sum transformations k-1 times
        for (int i = 1; i < k; ++i) {
            int digitSum = 0;
            while (currentNumber > 0) {
                digitSum += currentNumber % 10;
                currentNumber /= 10;
            }
            currentNumber = digitSum;

            // Break early if the current number becomes less than 10
            if (currentNumber < 10) {
                break;
            }
        }

        return currentNumber;
    }


}
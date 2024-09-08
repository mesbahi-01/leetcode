package org.example.titleToNumber;

public class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        int power = columnTitle.length() - 1;
        int j = 0;
        while(power > -1){
            sum += (columnTitle.charAt(j) - 'A' + 1) * Math.pow(26,power);
            power--;
            j++;
        }
        return sum;
    }
}
package org.example.makeSmallestPalindrome;

class Solution {
    public String makeSmallestPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] arr = s.toCharArray();

        for (;left < right; left++,right--){
            if (arr[left] == arr[right]){
                continue;
            }else if (arr[left] < arr[right]){
                arr[right] = arr[left];
            }else{
                arr[left] = arr[right];
            }
        }
        return new String(arr);

    }
}
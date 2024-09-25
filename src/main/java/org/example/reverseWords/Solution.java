package org.example.reverseWords;

class Solution {
    public String reverseWords(String s) {
        // start with an index i = 0,and j = i;
        // while i is less then s.length
        // if s[i] is a space or i equals s.length - 1
        // swap from j to i - 1
        // assign i + 1 to j
        // increment i by one
        char[] array = s.toCharArray();
        int end = 0, start = end;
        while (end < array.length) {
            if (array[end] == ' ') {
                swap(array, start, end - 1);
                start = end + 1;
            }
            end++;
        }
        swap(array, start, end - 1 );
        return new String(array);
    }

    public void swap(char[] s, int start, int end) {
        char temp;
        while (start < end) {
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            end--;
            start++;
        }
    }
}
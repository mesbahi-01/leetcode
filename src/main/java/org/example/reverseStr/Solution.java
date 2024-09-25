package org.example.reverseStr;

class Solution {
    /**
     * This method reverses the first k characters for every 2k characters counting from the start of the string.
     * If the remaining characters are less than k, then it reverses all of them.
     * If the remaining characters are less than 2k but greater than or equal to k, then it reverses the first k characters and leaves the others as original.
     *
     * @param s The input string to be reversed.
     * @param k The number of characters to be reversed.
     * @return The reversed string.
     */
    public String reverseStr(String s, int k) {
        char[] s_arr = s.toCharArray();
        int i = 0, j;
        int n = s_arr.length;
        while (i < n) {
            /*Input: s = "abcdefg", k = 2 */
            j = Math.min(i + k - 1, n - 1);
            swap(s_arr, i, j);
            i = i + 2 * k;
        }
        return new String(s_arr);
    }

    /**
     * This method swaps the characters of the array between the start and end indices.
     *
     * @param s The character array to be swapped.
     * @param start The start index for the swap.
     * @param end The end index for the swap.
     */
    public void swap(char[] s, int start, int end) {
        char temp ;
        while (start < end) {
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            end--;
            start++;
        }
    }
}
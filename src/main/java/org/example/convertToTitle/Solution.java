package org.example.convertToTitle;

public class Solution {
    public String convertToTitle(int columnNumber) {
        // Initialize a StringBuilder object to build the column title
        StringBuilder sb = new StringBuilder();

// Loop until the column number is greater than 0
        while (columnNumber > 0) {
            // Decrement the column number by 1
            columnNumber--;

            // Append the corresponding character to the StringBuilder
            // The character is determined by taking the remainder of the column number divided by 26 and adding 'A' to it
            // This is because there are 26 letters in the English alphabet
            sb.append((char) (columnNumber % 26 + 'A'));

            // Divide the column number by 26 to get the next character
            columnNumber /= 26;
        }

// Reverse the StringBuilder and convert it to a string
// This is because the column title is built from right to left
        return sb.reverse().toString();
    }
}
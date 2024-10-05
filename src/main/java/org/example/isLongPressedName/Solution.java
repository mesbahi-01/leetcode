package org.example.isLongPressedName;

public class Solution {
    public boolean isLongPressedName(String name, String typed) {
// Initialize two pointers to track the current position in the 'name' and 'typed' strings respectively.
        int pointer1 = 0;
        int pointer2 = 0;

// If the first characters of 'name' and 'typed' do not match, return false.
        if (name.charAt(pointer1) != typed.charAt(pointer2)) return false;

// Store the current character from 'name' to 'previousCharacter'.
        char previousCharacter = name.charAt(pointer1);

// Move both pointers to the next position.
        pointer1++;
        pointer2++;

// Loop through the 'name' and 'typed' strings.
        while (pointer1 < name.length() && pointer2 < typed.length()) {
            // If the current characters of 'name' and 'typed' match, update 'previousCharacter' and move 'pointer1' to the next position.
            if (name.charAt(pointer1) == typed.charAt(pointer2)) {
                previousCharacter = name.charAt(pointer1);
                pointer1++;
            }
            // If the current character of 'typed' does not match 'previousCharacter', return false.
            else if (typed.charAt(pointer2) != previousCharacter) {
                return false;
            }
            // Move 'pointer2' to the next position.
            pointer2++;
        }

// If all characters in 'name' have been checked, check the remaining characters in 'typed'.
        if (pointer1 >= name.length()) {
            // If the remaining characters in 'typed' match 'previousCharacter', move 'pointer2' to the next position.
            while (pointer2 < typed.length() && typed.charAt(pointer2) == previousCharacter) pointer2++;
            // If all characters in 'typed' have been checked, return true.
            if (pointer2 >= typed.length()) return true;
        }

// If the function has not returned yet, return false.
        return false;
    }
}
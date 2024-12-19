package org.example.strongPasswordCheckerII;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public static void main(String[] args){
        new Solution().strongPasswordCheckerII("IloveLe3tcode!");
    }
    public boolean strongPasswordCheckerII(String password) {
        return hasAtleast8characters(password) &&
                containsAtLeastOneLowerCase(password)&&
                containsAtLeastOneUpperCase(password)&&
                containsAtLeastOneDigit(password)&&
                containsAtLeastOneSpacialCharacter(password)&&
                !hasTwoAdjacentCharacters(password);
    }

    private boolean hasTwoAdjacentCharacters(String password) {
        if (password.isEmpty() ) return false;
        for (int i = 0; i < password.length() - 1 ; i++) {
            if (password.charAt(i) == password.charAt(i + 1)) return true;
        }
        return false;

    }

    private boolean containsAtLeastOneSpacialCharacter(String password) {
        Set<Character> set = new HashSet<>(List.of(
                '!','@','#','$','%','^','&','*','(',')','-','+'
        ));
        for (char c :
                password.toCharArray()) {
            if (set.contains(c)) return true;
        }
        return false;
    }

    private boolean containsAtLeastOneDigit(String password) {
        for (char c :
                password.toCharArray()) {
            if (c <= '9' && c >= '0') return true;
        }
        return false;
    }

    private boolean containsAtLeastOneUpperCase(String password) {
        for (char c :
                password.toCharArray()) {
            if (c <= 'Z' && c >= 'A') return true;
        }
        return false;
    }

    private boolean containsAtLeastOneLowerCase(String password) {
        for (char c :
                password.toCharArray()) {
            if (c <= 'z' && c >= 'a') return true;
        }
        return false;
    }

    private boolean hasAtleast8characters(String password) {

        return password.length()>=8;
    }
}
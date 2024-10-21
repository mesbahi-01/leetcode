package org.example.removeOuterParentheses;

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();

        int counter = 0;
        for (int i = 0,j = 0; j < s.length() ; ) {
            if (s.charAt(j) == '(' ){
                counter++;

            }else {
                counter--;
            }
            if (counter == 0){
                result.append(s.substring(i + 1,j));
                i = j + 1;
            }
            j++;
        }
        return result.toString();
    }
}
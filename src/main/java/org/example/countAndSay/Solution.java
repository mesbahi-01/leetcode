package org.example.countAndSay;

class Solution {
    public String countAndSay(int n) {
        String res = "1";

        for (int i = 1; i < n; i++) {
            res = runLengthEncoding(res);
        }

        return res;
    }

    private String runLengthEncoding(String s) {
        int counter = 0;
        int i = 0;
        StringBuilder res = new StringBuilder();
        char currentChar = s.charAt(i);
        i++;counter++;
        while (i < s.length()){
            if (currentChar == s.charAt(i)){
                counter++;
            }else{
                res.append(counter).append(currentChar);
                currentChar = s.charAt(i);
                counter = 1;
            }
            i++;
        }

        res.append(counter).append(currentChar);

        return res.toString();

    }
}
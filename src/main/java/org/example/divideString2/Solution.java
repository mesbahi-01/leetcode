package org.example.divideString2;

class Solution {
    public String[] divideString(String s, int k, char fill) {

        int resultLength;
        if (s.length() % k == 0) resultLength = s.length() / k;
        else resultLength = s.length() / k + 1;

        String[] results = new String[resultLength];
        int results_index = 0;
        int i = 0;
        for (; s.length() - i >= k; i += k) {
            results[results_index++] = s.substring(i, i + k);
        }

        if (i < s.length()){
            StringBuilder lastWord = new StringBuilder(s.substring(i));

            while (lastWord.length() < k){
                lastWord.append(fill);
            }

            results[results_index] = lastWord.toString();
        }

        return results;

    }
}
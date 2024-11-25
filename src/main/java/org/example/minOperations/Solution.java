package org.example.minOperations;

class Solution {
    public int minOperations(String[] logs) {
        int result = 0;
        for (String log :
                logs) {
            switch (log){
                case "../":
                    if (result > 0) result--;
                    break;
                case "./":
                    break;
                default:
                    result++;
            }

        }
        return result;
    }
}
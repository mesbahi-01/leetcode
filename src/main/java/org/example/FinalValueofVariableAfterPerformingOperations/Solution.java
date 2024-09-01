package org.example.FinalValueofVariableAfterPerformingOperations;

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (int i = 0; i < operations.length; i++) {
            x += 45 - operations[i].charAt(1);
        }
        return x;
    }
}

package org.example.minimumChairs;

class Solution {
    public int minimumChairs(String s) {
        int minimumChairs = 0;
        int availableChairs = 0;
        for (char action : s.toCharArray()) {
            if (action == 'E'){
                if (availableChairs <= 0){
                    minimumChairs++;
                }
                availableChairs = Math.max(availableChairs - 1, 0);
            }else{
                // L
                availableChairs++;
            }

        }
        return minimumChairs;
    }
}
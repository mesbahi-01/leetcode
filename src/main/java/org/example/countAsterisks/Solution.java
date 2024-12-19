package org.example.countAsterisks;

class Solution {
    public int countAsterisks(String s) {
        int astriksCounter = 0;
        int pipsCounter = 0;
        int total = 0;
        for (char c :
                s.toCharArray()) {// c|ùùù|
            if (c == '*') {
                astriksCounter++;
            } else if (c == '|'){
                pipsCounter++;
                if (pipsCounter < 2){
                    total += astriksCounter;
                    astriksCounter = 0;
                }else {
                    astriksCounter = 0;
                    pipsCounter = 0;
                }
            }
        }
        return total;

    }
}
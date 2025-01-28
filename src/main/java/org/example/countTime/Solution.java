package org.example.countTime;

class Solution {
    public int countTime(String time) {
        // ?   ?   :    ?6   ?10
        //
        String hours = time.substring(0, 2);
        String minutes = time.substring(3);

        int numberOfPossiblities = 0;
        int product = 1;
        if (minutes.charAt(0) == '?') product *= 6;
        if (minutes.charAt(1) == '?') product *= 10;
        if (product > 1) numberOfPossiblities = product;

        product = 1;
        if (hours.equals("??")) {
            product = 24;
        } else if (hours.charAt(0) == '?') {
            if (hours.charAt(1) < '4') {
                product = 3;
            } else {
                product = 2;
            }
        } else if (hours.charAt(1) == '?') {
            if (hours.charAt(0) == '0' || hours.charAt(0) == '1'){
                product  = 10;
            } else{
                product = 4;
            }
        }
        if (numberOfPossiblities == 0) return product;
        return (numberOfPossiblities *= product);
    }
}
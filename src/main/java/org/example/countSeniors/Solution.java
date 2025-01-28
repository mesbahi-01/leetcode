package org.example.countSeniors;

class Solution {
    public int countSeniors(String[] details) {
        int numberOfPassengersStrictlyAbove_60 = 0;

        for (String passenger :
               details ) {
            if (extractAge(passenger) > 60) numberOfPassengersStrictlyAbove_60++;
        }
        return numberOfPassengersStrictlyAbove_60;
    }

    private int extractAge(String passenger) {

        String age = passenger.substring(11,13);
        return Integer.parseInt(age);
    }
}
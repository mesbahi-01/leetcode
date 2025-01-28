package org.example.haveConflict;

class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        // timeStamp
        return (event1[1].compareTo(event2[0]) >= 0 && event2[0].compareTo(event1[1]) <= 0);

    }

    private int toTimeStamp(String s) {
        int hours = Integer.parseInt(s.substring(0, 2));
        int minutes = Integer.parseInt(s.substring(3));

        return hours * 60 * 60 + minutes * 60;
    }
}
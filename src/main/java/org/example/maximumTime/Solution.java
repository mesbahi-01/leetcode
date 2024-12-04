package org.example.maximumTime;

class Solution {
    public String maximumTime(String time) {
        // ?? -> 23
        // ?x -> x between [4,9] ? 1 : 2
        // x? -> x == 1 || x==0 ? 9 : 3

        String hours = time.substring(0, 2);
        String minutes = time.substring(3);

        StringBuilder maximumTime = new StringBuilder(time.length());

        if (hours.charAt(0) == '?') {
            if (hours.charAt(1) >= '4' && hours.charAt(1) <= '9') {
                maximumTime.append('1');
            } else {
                maximumTime.append('2');
            }
        } else {
            maximumTime.append(hours.charAt(0));
        }
        if (hours.charAt(1) == '?') {
            if (hours.charAt(0) == '1' || hours.charAt(0) == '0') {
                maximumTime.append('9');
            }else {
                maximumTime.append('3');
            }
        } else {
            maximumTime.append(hours.charAt(1));
        }

        maximumTime.append(":");

        if (minutes.charAt(0) == '?') {
            maximumTime.append('5');
        } else maximumTime.append(minutes.charAt(0));
        if (minutes.charAt(1) == '?') {
            maximumTime.append('9');
        } else maximumTime.append(minutes.charAt(1));
        return maximumTime.toString();
    }
}
package org.example.findLatestTime;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public String findLatestTime(String s) {
        StringBuffer stringBuffer = new StringBuffer(s);
        if (stringBuffer.charAt(0) == '?') {
            if (stringBuffer.charAt(1) == '?' || stringBuffer.charAt(1) == '0' || stringBuffer.charAt(1) == '1') {
                stringBuffer.setCharAt(0, '1');
            } else {
                stringBuffer.setCharAt(0, '0');
            }
        }
        if (stringBuffer.charAt(1) == '?') {
            if (stringBuffer.charAt(0) == '1') {
                stringBuffer.setCharAt(1, '1');
            } else {
                stringBuffer.setCharAt(1, '9');
            }
        }
        if (stringBuffer.charAt(3) == '?') {
            stringBuffer.setCharAt(3, '5');
        }
        if (stringBuffer.charAt(4) == '?') {
            stringBuffer.setCharAt(4, '9');
        }
        return stringBuffer.toString();
    }
}

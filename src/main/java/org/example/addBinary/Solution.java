package org.example.addBinary;

public class Solution {
    public String addBinary(String a, String b) {
        char[] ch = new char[Math.max(a.length(), b.length()) + 1];
        int e = ch.length - 1;
        int carray = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        while (i >= 0 || j >= 0) {
            if (i >= 0) {
                carray += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                carray += b.charAt(j) - '0';
                j--;
            }
            ch[e--] = (char) ('0' + carray % 2);
            carray = carray / 2;
        }
        if (carray == 1) {
            ch[0] = '1';
            return new String(ch);
        }
        return new String(ch, 1, ch.length - 1);
    }
}
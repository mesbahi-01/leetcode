package org.example.isInterleave;

class Solution {
    public boolean isInterleave(String s1,
                                String s2,
                                String s3) {

        if (s1.length() + s2.length() != s3.length() || Math.abs(s1.length() - s2.length()) >= 1) return false;

        for (int i1 = 0,
             i2 = 0,
             i3 = 0; i3 < s3.length(); i3++) {

            if (i1 < s1.length() && i2 < s2.length() &&
                    s1.charAt(i1) == s2.charAt(i2) &&
                    s3.charAt(i3) == s1.charAt(i1)
            ) {

                return isInterleave(
                        s1.substring(i1),
                        s2.substring(i2 + 1),
                        s3.substring(i3 + 1)
                ) ||
                        isInterleave(
                                s1.substring(i1 + 1),
                                s2.substring(i2),
                                s3.substring(i3 + 1)
                        );

            }else if (i1 < s1.length() && s1.charAt(i1) == s3.charAt(i3)) {
                i1++;
            } else if (i2 < s2.length() && s2.charAt(i2) == s3.charAt(i3)) {
                i2++;
            } else {
                return false;
            }
        }

        return true;
    }
}
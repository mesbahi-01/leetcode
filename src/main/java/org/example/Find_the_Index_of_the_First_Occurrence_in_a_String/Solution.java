package org.example.Find_the_Index_of_the_First_Occurrence_in_a_String;

class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0) return 0;
        if (haystack.length() < needle.length()) return -1;
        // for each haystack[i]
            // if haystack[i] equals needle[0]
            //  k = 1;
            // while(k < needle.length && needle[k] == haystack[i + k]) k++;
            // if k== needle.length return i
        // return -1

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int k = 1;
                while (k < needle.length() && needle.charAt(k) == haystack.charAt(i + k)) k++;
                if (k == needle.length()) return i;
            }
        }
        return -1;
    }
}
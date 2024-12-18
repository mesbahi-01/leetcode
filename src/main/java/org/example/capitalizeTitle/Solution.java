package org.example.capitalizeTitle;

class Solution {
    public String capitalizeTitle(String title) {
        char[] title_arr = new char[title.length()];

        for (int i = 0; i < title.length(); i++) {
            int j = i;
            int start = i;
            while (j < title.length() && title.charAt(j) != ' ') {
                j++;
                title_arr[i] = Character.toLowerCase(title.charAt(i++));
            }
            // word
            if (start - i > 2) {
                title_arr[start] = Character.toUpperCase(title.charAt(start));
            }

        }

        return new String(title_arr);
    }
}
package org.example.percentageLetter;

class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        int i = s.percentageLetter("foobar", 'o');
        System.out.println("i = " + i);
    }
    public int percentageLetter(String s, char letter) {
        float counter = 0;
        for (char c :
                s.toCharArray()) {
            if (c == letter) counter++;
        }
        return (int) (counter  * 100/ s.length());
    }
}
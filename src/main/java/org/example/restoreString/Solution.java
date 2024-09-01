package org.example.restoreString;

public class Solution {
    public String restoreString(String s, int[] indices) {
        // declare a newString of type StringBuffer with a size of s.length
        // for each character of s
        // newString.set(indices[i],s.charAt(i)
        // return newString

        char[] str= s.toCharArray();

        char[] arr= new char[s.length()];
        for (int i=0; i< indices.length; i++){
            arr[indices[i]]= str[i];
        }
        return new String(arr);
    }
}
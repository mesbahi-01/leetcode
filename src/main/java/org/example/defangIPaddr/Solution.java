package org.example.defangIPaddr;

class Solution {
    public String defangIPaddr(String address) {
        // start with an empty string s
        // loop through the string address
        // if you find a '.' add to s the string "[.]"
        // else add s[i]
        StringBuffer s  = new StringBuffer();

        for (int i = 0;  i < address.length(); i++) {
            if (address.charAt(i) == '.'){
                s.append("[.]");
            }else{
                s.append(address.charAt(i));
            }
        }
        return s.toString();
    }
}

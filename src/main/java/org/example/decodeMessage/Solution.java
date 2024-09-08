package org.example.decodeMessage;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String decodeMessage(String key, String message) {
        char[] keyMap = new char[123];
        char currentAlpha = 'a';
        for (char curr : key.toCharArray()) {
            if (curr != ' ' && keyMap[curr] == 0) {
                keyMap[curr] = currentAlpha++;
            }
            if (currentAlpha - 1 == 'z') break;
        }
        keyMap[' '] = ' ';

        char[] marr = message.toCharArray();
        char[] res = new char[message.length()];
        for (int j = 0; j < marr.length; j++) {
            char curr = marr[j];
            res[j] = keyMap[curr];
        }
        return new String(res);
        /*using hash map*/
        // create a hashmap called
        // "map_key_alphabet" to store the key and the alphabet
        // key is the key and the value is the alphabet
        // for example, if the key is "the quick brown fox jumps over the lazy dog"
        // the map_key_alphabet will be
        // {t=a, h=b, e=c, q=d, u=e, i=f, c=g, k=h, b=i, r=j, o=k, w=l, n=m, f=n, x=o, j=p, m=q, p=r, s=s, v=t, l=u, a=v, z=w, y=x, d=y, g=z}
        // the map_key_alphabet will be used to decode the message and should only contain the unique 26 characters in the key
        // and the value should be the alphabet in order from a to z

        /*Map<Character, Character> map_key_alphabet = new HashMap<>();
        for (int i = 0,j=0; i < key.length() && j < 27; i++) {
            if (map_key_alphabet.containsKey(key.charAt(i)) || key.charAt(i) == ' '){
                continue;
            }
            map_key_alphabet.put(key.charAt(i), (char) ('a' + j));
            j++;
        }

        StringBuffer decodeMessage = new StringBuffer(message.length());
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' '){
                decodeMessage.append(' ');
                continue;
            }
            decodeMessage.append(map_key_alphabet.get(message.charAt(i)));
        }

        return decodeMessage.toString();*/

    }
}
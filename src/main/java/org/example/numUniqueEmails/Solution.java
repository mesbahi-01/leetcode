package org.example.numUniqueEmails;

import java.util.HashSet;

public class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> email_set = new HashSet<>();

        for (String email :
                emails) {
            email_set.add(normalizeEmail(email));
        }
        return email_set.size();
    }

    private String normalizeEmail(String email) {
        StringBuilder normalizedEmail = new StringBuilder();
        int indexOfAt = email.indexOf('@');
        for (int i = 0; i < indexOfAt; i++) {
            if (email.charAt(i) == '.') continue;
            if (email.charAt(i) == '+') break;
            normalizedEmail.append(email.charAt(i));
        }
        for (int i = indexOfAt; i < email.length(); i++) {
            normalizedEmail.append(email.charAt(i));
        }
        return normalizedEmail.toString();
    }
}
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
        boolean found_at = false;
        boolean charAllowedToBeAdded;
        int index = 0;
        while (index < email.length()) {
            charAllowedToBeAdded = true;

            if (found_at) {
                normalizedEmail.append(email.charAt(index));
                index++;
            }
            else if (email.charAt(index) == '+') {
                while (index < email.length() && (email.charAt(index) != '@')) index++;
            }

            if (index >= email.length()) break;

            if (email.charAt(index) == '@') {
                found_at = true;
            }
            else if (email.charAt(index) == '.' && !found_at) {
                charAllowedToBeAdded = false;
            }

            if (charAllowedToBeAdded) {
                normalizedEmail.append(email.charAt(index));
            }
            index++;
        }
        return normalizedEmail.toString();
    }
}
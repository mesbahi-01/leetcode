package org.example.countMatches;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        // declare a counter and initialized it with 0
        // declare a variable indexOfRuleKey and initialized it with 0
        // if ruleKey is equal to "color" set indexOfRuleKey to 1
        // else if ruleKey is equal to "name" set indexOfRuleKey to 2
        // for each item in items
            // if item[indexOfRuleKey] is equal to ruleValue increment counter
        // return counter
        int counter = 0;
        int indexOfRuleKey = 0;

        if (ruleKey.equals("color"))
            indexOfRuleKey = 1;
        else if (ruleKey.equals("name"))
            indexOfRuleKey = 2;

        for (List<String> item : items) {
            if (item.get(indexOfRuleKey).equals(ruleValue))
                counter++;
        }
        return counter;
    }
}
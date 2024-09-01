package org.example.interpret;

public class Solution {
    public String interpret(String command) {
        // declare a string called interpretedCommand;
        // loop through the command string
        // if the character at index i is 'G' append 'G' to interpretedCommand
        // else if the character at index i is '('
        // if the character at index i+1 is ')' append 'o' to interpretedCommand and increment i by 2
        // else if the character at index i+1 is 'a' and the character at index i+2 is 'l' and the character at index i+3 is ')'
        // append 'al' to interpretedCommand and increment i by 4
        // return interpretedCommand

        StringBuffer interpretedCommand = new StringBuffer("");

        for (int i = 0; i < command.length(); ) {
            if (command.charAt(i) == 'G') {
                interpretedCommand.append(command.charAt(i));
                i++; // increment i by 1 to move to the next character in the command string
            } else if (command.charAt(i) == '(') {
                if (command.charAt(i + 1) == ')'
                ) {
                    interpretedCommand.append("o");
                    i += 2; // increment i by 2 to skip the next character ')'
                } else if (command.charAt(i + 1) == 'a'
                        && command.charAt(i + 2) == 'l'
                        && command.charAt(i + 3) == ')'
                ) {
                    interpretedCommand.append("al");
                    i += 4; // increment i by 4 to skip the next characters 'a', 'l' and ')'
                }
            }
        }
        return interpretedCommand.toString();
    }
}

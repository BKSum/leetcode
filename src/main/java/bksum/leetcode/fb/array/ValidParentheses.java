package bksum.leetcode.fb.array;

import java.util.*;

public class ValidParentheses {

    public boolean isValid(String s) {
        Map<Character, Character> validInput = new HashMap<>();
        validInput.put('}', '{');
        validInput.put(']', '[');
        validInput.put(')', '(');

        java.util.Collection openParen = validInput.values();
        Set<Character> closeParen = validInput.keySet();
        Stack<Character> stacker = new Stack<>();
        for(int i=0; i<s.length(); i++){
            Character temp = s.charAt(i);
            if(openParen.contains(temp))
                stacker.push(temp);
            else if(!stacker.empty() && closeParen.contains(temp) && stacker.peek() == validInput.get(temp)){
                stacker.pop();
            }else{
                return false;
            }
        }
        return true && stacker.empty();
    }
}

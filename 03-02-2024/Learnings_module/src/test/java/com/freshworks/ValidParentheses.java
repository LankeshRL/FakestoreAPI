package com.freshworks;

import java.util.Stack;

public class ValidParentheses {
	public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            // Push opening brackets to stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // If stack is empty, no matching opening bracket
                if (stack.isEmpty()) return false;
                
                char top = stack.pop(); // Get last opened bracket
                
                // Check if it matches the corresponding opening bracket
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        // Stack must be empty for a valid sequence
        return stack.isEmpty();
    }
    
     public static void main(String[] args) {
    	 ValidParentheses obj = new ValidParentheses();
        System.out.println(obj.isValid("[()]"));

     }
}

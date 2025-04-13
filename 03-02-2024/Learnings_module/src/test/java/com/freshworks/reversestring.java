package com.freshworks;

import java.util.Arrays;

public class reversestring {
	
	    public String reverseWords(String s) {
	        // Trim leading and trailing spaces
	        s = s.trim();

	        System.out.println(s);
	        // Split the string by spaces (one or more spaces)
	        String[] words = s.split("\\s+");

	       System.out.println(Arrays.toString(words));
	        // Reverse the words
	        StringBuilder result = new StringBuilder();
	        for (int i = words.length - 1; i >= 0; i--) {
	            result.append(words[i]);
	            if (i > 0) {
	                result.append(" "); // Add space between words
	            }
	        }

	        return result.toString();
	    }
	    
	    public static void main(String[] args) {
	    	reversestring obj = new reversestring();
	    	System.out.println(obj.reverseWords(" ahfsha    fna! "));
	}
}

package com.freshworks;

import java.util.HashSet;

public class LongestSubstring {

	    public int lengthOfLongestSubstring(String s) {
	        HashSet<Character> set = new HashSet<>(); // Stores unique characters in the current window
	        int left = 0, maxLength = 0;

	        for (int right = 0; right < s.length(); right++) {
	            // If duplicate character found, shrink the window from the left
	            while (set.contains(s.charAt(right))) {
	                set.remove(s.charAt(left)); // Remove leftmost character
	                left++; // Move left pointer to shrink window
	            }
	            
	            // Add the new character to the set
	            set.add(s.charAt(right));
	            
	            // Update the max length of the substring
	            maxLength = Math.max(maxLength, right - left + 1);
	        }

	        return maxLength;
	    }

	    public static void main(String[] args) {
	        LongestSubstring obj = new LongestSubstring();
	        System.out.println(obj.lengthOfLongestSubstring("abccvabcbb"));  // Output: 3 ("abc")
	        System.out.println(obj.lengthOfLongestSubstring("bbbbb"));     // Output: 1 ("b")
	        System.out.println(obj.lengthOfLongestSubstring("asdfljaah"));    // Output: 3 ("wke")
	    }
	}



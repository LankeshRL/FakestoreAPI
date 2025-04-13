package com.freshworks;

import java.util.HashSet;

public class Longestconsecutivesentence {
	    public int longestConsecutive(int[] nums) {
	        if (nums.length == 0) return 0;

	        HashSet<Integer> numSet = new HashSet<>();
	        for (int num : nums) {
	            numSet.add(num);
	        }

	        int longest = 0;

	        for (int num : numSet) {
	            // Start counting only if it's the beginning of a sequence
	            if (!numSet.contains(num - 1)) {
	                int currentNum = num;
	                int currentStreak = 1;

	                while (numSet.contains(currentNum + 1)) {
	                    currentNum++;
	                    currentStreak++;
	                }

	                longest = Math.max(longest, currentStreak);
	            }
	        }

	        return longest;
	    }
	    public static void main(String[] args) {
	    	Longestconsecutivesentence obj = new Longestconsecutivesentence();
	    	int [] nums1 = {100, 2,3,4,5,7,101};
	    	System.out.println(obj.longestConsecutive(nums1));
	}

}

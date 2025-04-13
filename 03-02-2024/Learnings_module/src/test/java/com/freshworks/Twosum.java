package com.freshworks;

import java.util.HashMap;
import java.util.Map;

public class Twosum {

	public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>(); // Stores number and its index
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Find the complement
            
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i}; // Return indices if complement found
            }
            
            numMap.put(nums[i], i); // Store the number and its index
        }
        
        return new int[]{}; // This won't be reached as per the problem statement
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int target = 5;
        int[] result = twoSum(nums, target);
        
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
    
}

package com.freshworks;

import java.util.HashSet;

public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        
        for (int num : nums) {
            if (numSet.contains(num)) {
                return true; // Duplicate found
            }
            numSet.add(num);
        }
        
        return false; // No duplicates
    }

    public static void main(String[] args) {
    	ContainsDuplicate obj = new ContainsDuplicate();
        int[] nums = {1, 2, 3, 4, 1};  // Example with a duplicate
        System.out.println(obj.containsDuplicate(nums)); // Output: true

        int[] nums2 = {1, 2, 3, 4};  // Example with all unique elements
        System.out.println(obj.containsDuplicate(nums2)); // Output: false
    }
}

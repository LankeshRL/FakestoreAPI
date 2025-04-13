package com.freshworks;

public class RotatedSortedArray {
	public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than right, search right half
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } 
            // Otherwise, search left half (including mid)
            else {
                right = mid;
            }
        }

        return nums[left]; // or nums[right] (both will be the minimum)
    }
    public static void main(String[] args) {
    	RotatedSortedArray obj = new RotatedSortedArray();
    	int[] nums1 = {3, 4, 5, 1, 2};
    	System.out.println(obj.findMin(nums1));
}

}

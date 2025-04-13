package com.freshworks;

public class SumofTwoIntegers {
	public int getSum(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1; // Calculate carry
            a = a ^ b; // Sum without carry
            b = carry; // Carry moved left
        }
        return a;
    }

    public static void main(String[] args) {
    	SumofTwoIntegers obj = new SumofTwoIntegers();
        System.out.println(obj.getSum(3, 5));  // Output: 8
        System.out.println(obj.getSum(-7, 4)); // Output: -3
        System.out.println(obj.getSum(10, -2)); // Output: 8
    }
}

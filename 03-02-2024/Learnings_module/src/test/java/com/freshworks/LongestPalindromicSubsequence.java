package com.freshworks;

public class LongestPalindromicSubsequence {
	    public int longestPalindromeSubseq(String s) {
	        int n = s.length();
	        int[][] dp = new int[n][n];

	        // Base case: Single character palindromes
	        for (int i = 0; i < n; i++) {
	            dp[i][i] = 1;
	        }

	        // Fill DP table from bottom up
	        for (int len = 2; len <= n; len++) {  // Length of the substring
	            for (int i = 0; i <= n - len; i++) {
	                int j = i + len - 1;
	                
	                if (s.charAt(i) == s.charAt(j)) {
	                    dp[i][j] = 2 + dp[i + 1][j - 1];
	                } else {
	                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
	                }
	            }
	        }

	        return dp[0][n - 1];  // The longest palindromic subsequence for the full string
	    }
}

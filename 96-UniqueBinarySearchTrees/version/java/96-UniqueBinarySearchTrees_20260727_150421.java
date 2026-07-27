// Last updated: 7/27/2026, 3:04:21 PM
1class Solution {
2    public int numTrees(int n) {
3        int[] dp = new int[n + 1];
4
5        dp[0] = 1;
6        dp[1] = 1;
7
8        for (int i = 2; i <= n; i++) {
9            for (int j = 1; j <= i; j++) {
10                dp[i] += dp[j - 1] * dp[i - j];
11            }
12        }
13
14        return dp[n];
15    }
16}
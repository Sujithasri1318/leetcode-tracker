// Last updated: 7/20/2026, 3:45:37 PM
1class Solution {
2    public int uniquePaths(int m, int n) {
3        int[][] dp = new int[m][n];
4
5        // First row
6        for (int j = 0; j < n; j++) {
7            dp[0][j] = 1;
8        }
9
10        // First column
11        for (int i = 0; i < m; i++) {
12            dp[i][0] = 1;
13        }
14
15        // Fill the DP table
16        for (int i = 1; i < m; i++) {
17            for (int j = 1; j < n; j++) {
18                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
19            }
20        }
21
22        return dp[m - 1][n - 1];
23    }
24}
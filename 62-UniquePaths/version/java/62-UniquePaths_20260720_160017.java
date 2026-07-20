// Last updated: 7/20/2026, 4:00:17 PM
1class Solution {
2    public int minPathSum(int[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5
6        int[] dp = new int[n];
7
8        dp[0] = grid[0][0];
9
10        // First row
11        for (int j = 1; j < n; j++) {
12            dp[j] = dp[j - 1] + grid[0][j];
13        }
14
15        // Remaining rows
16        for (int i = 1; i < m; i++) {
17            dp[0] += grid[i][0];
18
19            for (int j = 1; j < n; j++) {
20                dp[j] = Math.min(dp[j], dp[j - 1]) + grid[i][j];
21            }
22        }
23
24        return dp[n - 1];
25    }
26}
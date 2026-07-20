// Last updated: 7/20/2026, 3:47:39 PM
1class Solution {
2    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
3        int m = obstacleGrid.length;
4        int n = obstacleGrid[0].length;
5
6        int[] dp = new int[n];
7
8        // Starting cell
9        dp[0] = obstacleGrid[0][0] == 1 ? 0 : 1;
10
11        for (int i = 0; i < m; i++) {
12            for (int j = 0; j < n; j++) {
13
14                if (obstacleGrid[i][j] == 1) {
15                    dp[j] = 0;
16                } else if (j > 0) {
17                    dp[j] += dp[j - 1];
18                }
19            }
20        }
21
22        return dp[n - 1];
23    }
24}
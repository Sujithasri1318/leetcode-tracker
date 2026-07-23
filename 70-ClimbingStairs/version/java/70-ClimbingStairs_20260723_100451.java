// Last updated: 7/23/2026, 10:04:51 AM
1class Solution {
2    public int minDistance(String word1, String word2) {
3        int m = word1.length();
4        int n = word2.length();
5
6        int[][] dp = new int[m + 1][n + 1];
7
8        // Base cases
9        for (int i = 0; i <= m; i++) {
10            dp[i][0] = i;
11        }
12
13        for (int j = 0; j <= n; j++) {
14            dp[0][j] = j;
15        }
16
17        // Fill DP table
18        for (int i = 1; i <= m; i++) {
19            for (int j = 1; j <= n; j++) {
20
21                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
22                    dp[i][j] = dp[i - 1][j - 1];
23                } else {
24                    dp[i][j] = 1 + Math.min(
25                            dp[i - 1][j - 1],
26                            Math.min(dp[i - 1][j], dp[i][j - 1])
27                    );
28                }
29            }
30        }
31
32        return dp[m][n];
33    }
34}
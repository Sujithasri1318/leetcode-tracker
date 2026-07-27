// Last updated: 7/27/2026, 3:18:27 PM
1class Solution {
2    public boolean isInterleave(String s1, String s2, String s3) {
3
4        int m = s1.length();
5        int n = s2.length();
6
7        if (m + n != s3.length()) {
8            return false;
9        }
10
11        boolean[][] dp = new boolean[m + 1][n + 1];
12
13        dp[0][0] = true;
14
15        // First column
16        for (int i = 1; i <= m; i++) {
17            dp[i][0] = dp[i - 1][0] &&
18                    s1.charAt(i - 1) == s3.charAt(i - 1);
19        }
20
21        // First row
22        for (int j = 1; j <= n; j++) {
23            dp[0][j] = dp[0][j - 1] &&
24                    s2.charAt(j - 1) == s3.charAt(j - 1);
25        }
26
27        // Fill DP table
28        for (int i = 1; i <= m; i++) {
29            for (int j = 1; j <= n; j++) {
30
31                dp[i][j] =
32                    (dp[i - 1][j] &&
33                    s1.charAt(i - 1) == s3.charAt(i + j - 1))
34                    ||
35                    (dp[i][j - 1] &&
36                    s2.charAt(j - 1) == s3.charAt(i + j - 1));
37            }
38        }
39
40        return dp[m][n];
41    }
42}
43
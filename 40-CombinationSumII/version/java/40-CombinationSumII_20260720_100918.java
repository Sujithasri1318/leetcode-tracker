// Last updated: 7/20/2026, 10:09:18 AM
1class Solution {
2    public boolean isMatch(String s, String p) {
3        int m = s.length();
4        int n = p.length();
5
6        boolean[][] dp = new boolean[m + 1][n + 1];
7
8        dp[0][0] = true;
9
10        // Handle patterns like *, **, ***
11        for (int j = 1; j <= n; j++) {
12            if (p.charAt(j - 1) == '*') {
13                dp[0][j] = dp[0][j - 1];
14            }
15        }
16
17        for (int i = 1; i <= m; i++) {
18            for (int j = 1; j <= n; j++) {
19
20                char pc = p.charAt(j - 1);
21
22                if (pc == '?' || pc == s.charAt(i - 1)) {
23                    dp[i][j] = dp[i - 1][j - 1];
24                } 
25                else if (pc == '*') {
26                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
27                }
28            }
29        }
30
31        return dp[m][n];
32    }
33}
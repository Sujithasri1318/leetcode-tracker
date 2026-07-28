// Last updated: 7/28/2026, 3:50:03 PM
1class Solution {
2    public int minCut(String s) {
3
4        int n = s.length();
5
6        boolean[][] palindrome = new boolean[n][n];
7        int[] dp = new int[n];
8
9        for (int i = 0; i < n; i++) {
10            dp[i] = i;
11        }
12
13        for (int end = 0; end < n; end++) {
14
15            for (int start = 0; start <= end; start++) {
16
17                if (s.charAt(start) == s.charAt(end) &&
18                        (end - start <= 2 || palindrome[start + 1][end - 1])) {
19
20                    palindrome[start][end] = true;
21
22                    if (start == 0) {
23                        dp[end] = 0;
24                    } else {
25                        dp[end] = Math.min(dp[end], dp[start - 1] + 1);
26                    }
27                }
28            }
29        }
30
31        return dp[n - 1];
32    }
33}
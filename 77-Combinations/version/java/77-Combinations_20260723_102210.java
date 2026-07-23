// Last updated: 7/23/2026, 10:22:10 AM
1class Solution {
2    public int numDecodings(String s) {
3        int n = s.length();
4
5        if (n == 0 || s.charAt(0) == '0') {
6            return 0;
7        }
8
9        int[] dp = new int[n + 1];
10        dp[0] = 1;
11        dp[1] = 1;
12
13        for (int i = 2; i <= n; i++) {
14
15            // Single digit
16            if (s.charAt(i - 1) != '0') {
17                dp[i] += dp[i - 1];
18            }
19
20            // Two digits
21            int twoDigit = Integer.parseInt(s.substring(i - 2, i));
22            if (twoDigit >= 10 && twoDigit <= 26) {
23                dp[i] += dp[i - 2];
24            }
25        }
26
27        return dp[n];
28    }
29}
// Last updated: 7/28/2026, 3:55:25 PM
1import java.util.*;
2
3class Solution {
4    public boolean wordBreak(String s, List<String> wordDict) {
5
6        Set<String> set = new HashSet<>(wordDict);
7        boolean[] dp = new boolean[s.length() + 1];
8
9        dp[0] = true;
10
11        for (int i = 1; i <= s.length(); i++) {
12
13            for (int j = 0; j < i; j++) {
14
15                if (dp[j] && set.contains(s.substring(j, i))) {
16                    dp[i] = true;
17                    break;
18                }
19            }
20        }
21
22        return dp[s.length()];
23    }
24}
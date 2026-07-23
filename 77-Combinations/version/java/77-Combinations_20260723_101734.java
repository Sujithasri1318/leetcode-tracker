// Last updated: 7/23/2026, 10:17:34 AM
1import java.util.HashMap;
2import java.util.Map;
3
4class Solution {
5
6    private Map<String, Boolean> memo = new HashMap<>();
7
8    public boolean isScramble(String s1, String s2) {
9
10        if (s1.equals(s2)) {
11            return true;
12        }
13
14        if (s1.length() != s2.length()) {
15            return false;
16        }
17
18        String key = s1 + "#" + s2;
19
20        if (memo.containsKey(key)) {
21            return memo.get(key);
22        }
23
24        // Prune if character counts differ
25        int[] count = new int[26];
26
27        for (int i = 0; i < s1.length(); i++) {
28            count[s1.charAt(i) - 'a']++;
29            count[s2.charAt(i) - 'a']--;
30        }
31
32        for (int c : count) {
33            if (c != 0) {
34                memo.put(key, false);
35                return false;
36            }
37        }
38
39        int n = s1.length();
40
41        for (int i = 1; i < n; i++) {
42
43            // Without swap
44            if (isScramble(s1.substring(0, i), s2.substring(0, i)) &&
45                isScramble(s1.substring(i), s2.substring(i))) {
46
47                memo.put(key, true);
48                return true;
49            }
50
51            // With swap
52            if (isScramble(s1.substring(0, i), s2.substring(n - i)) &&
53                isScramble(s1.substring(i), s2.substring(0, n - i))) {
54
55                memo.put(key, true);
56                return true;
57            }
58        }
59
60        memo.put(key, false);
61        return false;
62    }
63}
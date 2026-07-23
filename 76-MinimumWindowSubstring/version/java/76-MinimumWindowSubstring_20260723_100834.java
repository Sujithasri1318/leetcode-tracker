// Last updated: 7/23/2026, 10:08:34 AM
1class Solution {
2    public String minWindow(String s, String t) {
3        if (s.length() < t.length()) {
4            return "";
5        }
6
7        int[] count = new int[128];
8
9        // Store frequency of characters in t
10        for (char c : t.toCharArray()) {
11            count[c]++;
12        }
13
14        int left = 0;
15        int required = t.length();
16        int minLen = Integer.MAX_VALUE;
17        int start = 0;
18
19        for (int right = 0; right < s.length(); right++) {
20
21            char ch = s.charAt(right);
22
23            if (count[ch] > 0) {
24                required--;
25            }
26
27            count[ch]--;
28
29            while (required == 0) {
30
31                if (right - left + 1 < minLen) {
32                    minLen = right - left + 1;
33                    start = left;
34                }
35
36                char leftChar = s.charAt(left);
37
38                count[leftChar]++;
39
40                if (count[leftChar] > 0) {
41                    required++;
42                }
43
44                left++;
45            }
46        }
47
48        return minLen == Integer.MAX_VALUE
49                ? ""
50                : s.substring(start, start + minLen);
51    }
52}
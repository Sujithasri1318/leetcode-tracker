// Last updated: 7/23/2026, 10:23:48 AM
1import java.util.*;
2
3class Solution {
4    public List<String> restoreIpAddresses(String s) {
5        List<String> result = new ArrayList<>();
6        backtrack(s, 0, 0, new ArrayList<>(), result);
7        return result;
8    }
9
10    private void backtrack(String s, int index, int part,
11                           List<String> current,
12                           List<String> result) {
13
14        // If 4 parts are formed
15        if (part == 4) {
16            if (index == s.length()) {
17                result.add(String.join(".", current));
18            }
19            return;
20        }
21
22        // Try lengths 1, 2, and 3
23        for (int len = 1; len <= 3; len++) {
24
25            if (index + len > s.length()) {
26                break;
27            }
28
29            String segment = s.substring(index, index + len);
30
31            // Leading zero check
32            if (segment.length() > 1 && segment.charAt(0) == '0') {
33                continue;
34            }
35
36            int value = Integer.parseInt(segment);
37
38            if (value <= 255) {
39                current.add(segment);
40                backtrack(s, index + len, part + 1, current, result);
41                current.remove(current.size() - 1);
42            }
43        }
44    }
45}
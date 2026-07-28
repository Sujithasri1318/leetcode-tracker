// Last updated: 7/28/2026, 3:49:02 PM
1import java.util.*;
2
3class Solution {
4
5    public List<List<String>> partition(String s) {
6
7        List<List<String>> result = new ArrayList<>();
8        backtrack(s, 0, new ArrayList<>(), result);
9        return result;
10    }
11
12    private void backtrack(String s, int start, List<String> path,
13                           List<List<String>> result) {
14
15        if (start == s.length()) {
16            result.add(new ArrayList<>(path));
17            return;
18        }
19
20        for (int end = start; end < s.length(); end++) {
21
22            if (isPalindrome(s, start, end)) {
23
24                path.add(s.substring(start, end + 1));
25
26                backtrack(s, end + 1, path, result);
27
28                path.remove(path.size() - 1);
29            }
30        }
31    }
32
33    private boolean isPalindrome(String s, int left, int right) {
34
35        while (left < right) {
36
37            if (s.charAt(left) != s.charAt(right))
38                return false;
39
40            left++;
41            right--;
42        }
43
44        return true;
45    }
46}
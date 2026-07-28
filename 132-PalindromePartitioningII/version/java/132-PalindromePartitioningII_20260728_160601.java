// Last updated: 7/28/2026, 4:06:01 PM
1class Solution {
2    public String reverseWords(String s) {
3
4        String[] words = s.trim().split("\\s+");
5        StringBuilder result = new StringBuilder();
6
7        for (int i = words.length - 1; i >= 0; i--) {
8            result.append(words[i]);
9
10            if (i != 0)
11                result.append(" ");
12        }
13
14        return result.toString();
15    }
16}
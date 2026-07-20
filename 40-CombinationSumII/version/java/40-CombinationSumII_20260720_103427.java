// Last updated: 7/20/2026, 10:34:27 AM
1class Solution {
2    public int lengthOfLastWord(String s) {
3        int i = s.length() - 1;
4
5        // Skip trailing spaces
6        while (i >= 0 && s.charAt(i) == ' ') {
7            i--;
8        }
9
10        int length = 0;
11
12        // Count characters of the last word
13        while (i >= 0 && s.charAt(i) != ' ') {
14            length++;
15            i--;
16        }
17
18        return length;
19    }
20}
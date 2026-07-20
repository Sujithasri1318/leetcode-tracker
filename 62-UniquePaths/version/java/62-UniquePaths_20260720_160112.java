// Last updated: 7/20/2026, 4:01:12 PM
1class Solution {
2    public boolean isNumber(String s) {
3        boolean seenDigit = false;
4        boolean seenDot = false;
5        boolean seenExponent = false;
6        boolean digitAfterExponent = true;
7
8        for (int i = 0; i < s.length(); i++) {
9            char c = s.charAt(i);
10
11            if (Character.isDigit(c)) {
12                seenDigit = true;
13                digitAfterExponent = true;
14            } 
15            else if (c == '+' || c == '-') {
16                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
17                    return false;
18                }
19            } 
20            else if (c == '.') {
21                if (seenDot || seenExponent) {
22                    return false;
23                }
24                seenDot = true;
25            } 
26            else if (c == 'e' || c == 'E') {
27                if (seenExponent || !seenDigit) {
28                    return false;
29                }
30                seenExponent = true;
31                digitAfterExponent = false;
32            } 
33            else {
34                return false;
35            }
36        }
37
38        return seenDigit && digitAfterExponent;
39    }
40}
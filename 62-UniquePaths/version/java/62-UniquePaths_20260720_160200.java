// Last updated: 7/20/2026, 4:02:00 PM
1class Solution {
2    public int[] plusOne(int[] digits) {
3
4        for (int i = digits.length - 1; i >= 0; i--) {
5
6            if (digits[i] < 9) {
7                digits[i]++;
8                return digits;
9            }
10
11            digits[i] = 0;
12        }
13
14        // All digits were 9
15        int[] result = new int[digits.length + 1];
16        result[0] = 1;
17
18        return result;
19    }
20}
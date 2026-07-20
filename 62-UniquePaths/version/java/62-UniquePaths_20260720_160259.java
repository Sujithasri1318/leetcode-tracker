// Last updated: 7/20/2026, 4:02:59 PM
1class Solution {
2    public String addBinary(String a, String b) {
3        StringBuilder result = new StringBuilder();
4
5        int i = a.length() - 1;
6        int j = b.length() - 1;
7        int carry = 0;
8
9        while (i >= 0 || j >= 0 || carry != 0) {
10
11            int sum = carry;
12
13            if (i >= 0) {
14                sum += a.charAt(i) - '0';
15                i--;
16            }
17
18            if (j >= 0) {
19                sum += b.charAt(j) - '0';
20                j--;
21            }
22
23            result.append(sum % 2);
24            carry = sum / 2;
25        }
26
27        return result.reverse().toString();
28    }
29}
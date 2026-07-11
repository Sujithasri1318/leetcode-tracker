// Last updated: 7/11/2026, 4:02:08 PM
1class Solution {
2    public int divide(int dividend, int divisor) {
3
4        // Handle overflow case
5        if (dividend == Integer.MIN_VALUE && divisor == -1) {
6            return Integer.MAX_VALUE;
7        }
8
9        // Find the sign of the result
10        boolean negative = (dividend < 0) ^ (divisor < 0);
11
12        long dvd = Math.abs((long) dividend);
13        long dvs = Math.abs((long) divisor);
14
15        long quotient = 0;
16
17        while (dvd >= dvs) {
18            long temp = dvs;
19            long multiple = 1;
20
21            while ((temp << 1) <= dvd) {
22                temp <<= 1;
23                multiple <<= 1;
24            }
25
26            dvd -= temp;
27            quotient += multiple;
28        }
29
30        if (negative) {
31            quotient = -quotient;
32        }
33
34        return (int) quotient;
35    }
36}
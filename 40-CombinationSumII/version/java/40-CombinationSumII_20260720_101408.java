// Last updated: 7/20/2026, 10:14:08 AM
1class Solution {
2    public double myPow(double x, int n) {
3        long N = n;
4
5        if (N < 0) {
6            x = 1 / x;
7            N = -N;
8        }
9
10        double result = 1.0;
11
12        while (N > 0) {
13            if ((N & 1) == 1) {
14                result *= x;
15            }
16
17            x *= x;
18            N >>= 1;
19        }
20
21        return result;
22    }
23}
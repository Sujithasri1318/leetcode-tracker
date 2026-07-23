// Last updated: 7/23/2026, 10:03:16 AM
1class Solution {
2    public int climbStairs(int n) {
3        if (n <= 2) {
4            return n;
5        }
6
7        int first = 1;
8        int second = 2;
9
10        for (int i = 3; i <= n; i++) {
11            int third = first + second;
12            first = second;
13            second = third;
14        }
15
16        return second;
17    }
18}
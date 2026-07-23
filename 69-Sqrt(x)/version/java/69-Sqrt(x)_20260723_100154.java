// Last updated: 7/23/2026, 10:01:54 AM
1class Solution {
2    public int mySqrt(int x) {
3        if (x == 0 || x == 1) {
4            return x;
5        }
6
7        int left = 1;
8        int right = x;
9        int answer = 0;
10
11        while (left <= right) {
12            int mid = left + (right - left) / 2;
13            long square = (long) mid * mid;
14
15            if (square == x) {
16                return mid;
17            } else if (square < x) {
18                answer = mid;
19                left = mid + 1;
20            } else {
21                right = mid - 1;
22            }
23        }
24
25        return answer;
26    }
27}
// Last updated: 7/28/2026, 3:54:19 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3
4        int ones = 0;
5        int twos = 0;
6
7        for (int num : nums) {
8            ones = (ones ^ num) & ~twos;
9            twos = (twos ^ num) & ~ones;
10        }
11
12        return ones;
13    }
14}
15
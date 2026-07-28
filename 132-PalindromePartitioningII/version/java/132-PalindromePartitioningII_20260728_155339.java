// Last updated: 7/28/2026, 3:53:39 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3
4        int result = 0;
5
6        for (int num : nums) {
7            result ^= num;
8        }
9
10        return result;
11    }
12}
13
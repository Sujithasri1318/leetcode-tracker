// Last updated: 7/20/2026, 10:07:22 AM
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        int n = nums.length;
4
5        // Place each number in its correct position
6        for (int i = 0; i < n; i++) {
7            while (nums[i] > 0 &&
8                   nums[i] <= n &&
9                   nums[nums[i] - 1] != nums[i]) {
10
11                int temp = nums[i];
12                nums[i] = nums[temp - 1];
13                nums[temp - 1] = temp;
14            }
15        }
16
17        // Find the first missing positive
18        for (int i = 0; i < n; i++) {
19            if (nums[i] != i + 1) {
20                return i + 1;
21            }
22        }
23
24        return n + 1;
25    }
26}
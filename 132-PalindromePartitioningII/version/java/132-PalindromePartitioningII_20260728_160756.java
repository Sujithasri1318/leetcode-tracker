// Last updated: 7/28/2026, 4:07:56 PM
1class Solution {
2    public int findMin(int[] nums) {
3
4        int left = 0;
5        int right = nums.length - 1;
6
7        while (left < right) {
8
9            int mid = left + (right - left) / 2;
10
11            if (nums[mid] > nums[right]) {
12                // Minimum is in right half
13                left = mid + 1;
14
15            } else if (nums[mid] < nums[right]) {
16                // Minimum is in left half including mid
17                right = mid;
18
19            } else {
20                // nums[mid] == nums[right]
21                // Cannot decide, reduce search space
22                right--;
23            }
24        }
25
26        return nums[left];
27    }
28}
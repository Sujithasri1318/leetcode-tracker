// Last updated: 7/28/2026, 4:07:11 PM
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
11            // Minimum is in right half
12            if (nums[mid] > nums[right]) {
13                left = mid + 1;
14            }
15            // Minimum is in left half or mid itself
16            else {
17                right = mid;
18            }
19        }
20
21        return nums[left];
22    }
23}
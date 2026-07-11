// Last updated: 7/11/2026, 4:08:11 PM
1class Solution {
2    public int search(int[] nums, int target) {
3
4        int left = 0;
5        int right = nums.length - 1;
6
7        while (left <= right) {
8
9            int mid = left + (right - left) / 2;
10
11            if (nums[mid] == target) {
12                return mid;
13            }
14
15            // Left half is sorted
16            if (nums[left] <= nums[mid]) {
17
18                if (target >= nums[left] && target < nums[mid]) {
19                    right = mid - 1;
20                } else {
21                    left = mid + 1;
22                }
23
24            }
25            // Right half is sorted
26            else {
27
28                if (target > nums[mid] && target <= nums[right]) {
29                    left = mid + 1;
30                } else {
31                    right = mid - 1;
32                }
33            }
34        }
35
36        return -1;
37    }
38}
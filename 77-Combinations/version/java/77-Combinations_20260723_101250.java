// Last updated: 7/23/2026, 10:12:50 AM
1class Solution {
2    public boolean search(int[] nums, int target) {
3        int left = 0;
4        int right = nums.length - 1;
5
6        while (left <= right) {
7            int mid = left + (right - left) / 2;
8
9            if (nums[mid] == target) {
10                return true;
11            }
12
13            // Handle duplicates
14            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
15                left++;
16                right--;
17            }
18            // Left half is sorted
19            else if (nums[left] <= nums[mid]) {
20                if (target >= nums[left] && target < nums[mid]) {
21                    right = mid - 1;
22                } else {
23                    left = mid + 1;
24                }
25            }
26            // Right half is sorted
27            else {
28                if (target > nums[mid] && target <= nums[right]) {
29                    left = mid + 1;
30                } else {
31                    right = mid - 1;
32                }
33            }
34        }
35
36        return false;
37    }
38}
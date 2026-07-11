// Last updated: 7/11/2026, 4:03:52 PM
1class Solution {
2    public void nextPermutation(int[] nums) {
3
4        int i = nums.length - 2;
5
6        // Step 1: Find first decreasing element
7        while (i >= 0 && nums[i] >= nums[i + 1]) {
8            i--;
9        }
10
11        // Step 2: Find element just larger than nums[i]
12        if (i >= 0) {
13            int j = nums.length - 1;
14
15            while (nums[j] <= nums[i]) {
16                j--;
17            }
18
19            swap(nums, i, j);
20        }
21
22        // Step 3: Reverse the remaining elements
23        reverse(nums, i + 1, nums.length - 1);
24    }
25
26    private void swap(int[] nums, int i, int j) {
27        int temp = nums[i];
28        nums[i] = nums[j];
29        nums[j] = temp;
30    }
31
32    private void reverse(int[] nums, int left, int right) {
33        while (left < right) {
34            swap(nums, left, right);
35            left++;
36            right--;
37        }
38    }
39}
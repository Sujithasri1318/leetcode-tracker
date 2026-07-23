// Last updated: 7/23/2026, 10:07:06 AM
1class Solution {
2    public void sortColors(int[] nums) {
3        int low = 0;
4        int mid = 0;
5        int high = nums.length - 1;
6
7        while (mid <= high) {
8            if (nums[mid] == 0) {
9                swap(nums, low, mid);
10                low++;
11                mid++;
12            } else if (nums[mid] == 1) {
13                mid++;
14            } else {
15                swap(nums, mid, high);
16                high--;
17            }
18        }
19    }
20
21    private void swap(int[] nums, int i, int j) {
22        int temp = nums[i];
23        nums[i] = nums[j];
24        nums[j] = temp;
25    }
26}
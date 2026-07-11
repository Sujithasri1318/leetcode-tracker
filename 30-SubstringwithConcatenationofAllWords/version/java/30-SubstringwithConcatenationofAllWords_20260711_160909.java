// Last updated: 7/11/2026, 4:09:09 PM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3
4        int[] ans = {-1, -1};
5
6        ans[0] = findFirst(nums, target);
7
8        if (ans[0] == -1) {
9            return ans;
10        }
11
12        ans[1] = findLast(nums, target);
13
14        return ans;
15    }
16
17    private int findFirst(int[] nums, int target) {
18
19        int left = 0;
20        int right = nums.length - 1;
21        int ans = -1;
22
23        while (left <= right) {
24
25            int mid = left + (right - left) / 2;
26
27            if (nums[mid] == target) {
28                ans = mid;
29                right = mid - 1;
30            } else if (nums[mid] < target) {
31                left = mid + 1;
32            } else {
33                right = mid - 1;
34            }
35        }
36
37        return ans;
38    }
39
40    private int findLast(int[] nums, int target) {
41
42        int left = 0;
43        int right = nums.length - 1;
44        int ans = -1;
45
46        while (left <= right) {
47
48            int mid = left + (right - left) / 2;
49
50            if (nums[mid] == target) {
51                ans = mid;
52                left = mid + 1;
53            } else if (nums[mid] < target) {
54                left = mid + 1;
55            } else {
56                right = mid - 1;
57            }
58        }
59
60        return ans;
61    }
62}
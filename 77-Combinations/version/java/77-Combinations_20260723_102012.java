// Last updated: 7/23/2026, 10:20:12 AM
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int i = m - 1;
4        int j = n - 1;
5        int k = m + n - 1;
6
7        while (i >= 0 && j >= 0) {
8            if (nums1[i] > nums2[j]) {
9                nums1[k] = nums1[i];
10                i--;
11            } else {
12                nums1[k] = nums2[j];
13                j--;
14            }
15            k--;
16        }
17
18        // Copy remaining elements of nums2
19        while (j >= 0) {
20            nums1[k] = nums2[j];
21            j--;
22            k--;
23        }
24    }
25}
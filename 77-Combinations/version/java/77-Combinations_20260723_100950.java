// Last updated: 7/23/2026, 10:09:50 AM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> subsets(int[] nums) {
5        List<List<Integer>> result = new ArrayList<>();
6        backtrack(0, nums, new ArrayList<>(), result);
7        return result;
8    }
9
10    private void backtrack(int start, int[] nums,
11                           List<Integer> current,
12                           List<List<Integer>> result) {
13
14        result.add(new ArrayList<>(current));
15
16        for (int i = start; i < nums.length; i++) {
17            current.add(nums[i]);
18            backtrack(i + 1, nums, current, result);
19            current.remove(current.size() - 1); // Backtrack
20        }
21    }
22}
// Last updated: 7/23/2026, 10:21:30 AM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> subsetsWithDup(int[] nums) {
5        List<List<Integer>> result = new ArrayList<>();
6        Arrays.sort(nums);
7
8        backtrack(nums, 0, new ArrayList<>(), result);
9        return result;
10    }
11
12    private void backtrack(int[] nums, int start,
13                           List<Integer> current,
14                           List<List<Integer>> result) {
15
16        result.add(new ArrayList<>(current));
17
18        for (int i = start; i < nums.length; i++) {
19
20            // Skip duplicates
21            if (i > start && nums[i] == nums[i - 1]) {
22                continue;
23            }
24
25            current.add(nums[i]);
26            backtrack(nums, i + 1, current, result);
27            current.remove(current.size() - 1);
28        }
29    }
30}
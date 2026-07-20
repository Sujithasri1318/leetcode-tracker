// Last updated: 7/20/2026, 10:10:55 AM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> permute(int[] nums) {
5        List<List<Integer>> result = new ArrayList<>();
6        boolean[] used = new boolean[nums.length];
7        backtrack(nums, used, new ArrayList<>(), result);
8        return result;
9    }
10
11    private void backtrack(int[] nums, boolean[] used,
12                           List<Integer> current,
13                           List<List<Integer>> result) {
14
15        if (current.size() == nums.length) {
16            result.add(new ArrayList<>(current));
17            return;
18        }
19
20        for (int i = 0; i < nums.length; i++) {
21            if (used[i]) {
22                continue;
23            }
24
25            used[i] = true;
26            current.add(nums[i]);
27
28            backtrack(nums, used, current, result);
29
30            current.remove(current.size() - 1);
31            used[i] = false;
32        }
33    }
34}
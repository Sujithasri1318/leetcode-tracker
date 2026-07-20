// Last updated: 7/20/2026, 10:11:29 AM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> permuteUnique(int[] nums) {
5        List<List<Integer>> result = new ArrayList<>();
6        Arrays.sort(nums);
7        boolean[] used = new boolean[nums.length];
8        backtrack(nums, used, new ArrayList<>(), result);
9        return result;
10    }
11
12    private void backtrack(int[] nums, boolean[] used,
13                           List<Integer> current,
14                           List<List<Integer>> result) {
15
16        if (current.size() == nums.length) {
17            result.add(new ArrayList<>(current));
18            return;
19        }
20
21        for (int i = 0; i < nums.length; i++) {
22
23            if (used[i]) {
24                continue;
25            }
26
27            // Skip duplicates
28            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
29                continue;
30            }
31
32            used[i] = true;
33            current.add(nums[i]);
34
35            backtrack(nums, used, current, result);
36
37            current.remove(current.size() - 1);
38            used[i] = false;
39        }
40    }
41}
// Last updated: 7/28/2026, 4:06:38 PM
1class Solution {
2    public int maxProduct(int[] nums) {
3
4        int maxProduct = nums[0];
5        int currMax = nums[0];
6        int currMin = nums[0];
7
8        for (int i = 1; i < nums.length; i++) {
9
10            int num = nums[i];
11
12            // Swap when multiplying by negative
13            if (num < 0) {
14                int temp = currMax;
15                currMax = currMin;
16                currMin = temp;
17            }
18
19            currMax = Math.max(num, currMax * num);
20            currMin = Math.min(num, currMin * num);
21
22            maxProduct = Math.max(maxProduct, currMax);
23        }
24
25        return maxProduct;
26    }
27}
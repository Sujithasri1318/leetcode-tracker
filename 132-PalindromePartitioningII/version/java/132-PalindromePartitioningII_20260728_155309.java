// Last updated: 7/28/2026, 3:53:09 PM
1class Solution {
2    public int candy(int[] ratings) {
3
4        int n = ratings.length;
5        int[] candies = new int[n];
6
7        // Give each child at least one candy
8        for (int i = 0; i < n; i++) {
9            candies[i] = 1;
10        }
11
12        // Left to Right
13        for (int i = 1; i < n; i++) {
14            if (ratings[i] > ratings[i - 1]) {
15                candies[i] = candies[i - 1] + 1;
16            }
17        }
18
19        // Right to Left
20        for (int i = n - 2; i >= 0; i--) {
21            if (ratings[i] > ratings[i + 1]) {
22                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
23            }
24        }
25
26        int total = 0;
27        for (int candy : candies) {
28            total += candy;
29        }
30
31        return total;
32    }
33}
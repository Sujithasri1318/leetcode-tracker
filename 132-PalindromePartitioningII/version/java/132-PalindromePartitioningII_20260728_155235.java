// Last updated: 7/28/2026, 3:52:35 PM
1class Solution {
2    public int canCompleteCircuit(int[] gas, int[] cost) {
3
4        int totalGas = 0;
5        int totalCost = 0;
6        int tank = 0;
7        int start = 0;
8
9        for (int i = 0; i < gas.length; i++) {
10
11            totalGas += gas[i];
12            totalCost += cost[i];
13
14            tank += gas[i] - cost[i];
15
16            if (tank < 0) {
17                start = i + 1;
18                tank = 0;
19            }
20        }
21
22        return totalGas >= totalCost ? start : -1;
23    }
24}
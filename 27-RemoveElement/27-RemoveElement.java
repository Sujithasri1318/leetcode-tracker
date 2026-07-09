// Last updated: 7/9/2026, 10:06:36 AM
class Solution {
    public int removeElement(int[] nums, int val) {

        int i = 0;

        for (int j = 0; j < nums.length; j++) {

            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }
}
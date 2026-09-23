class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int total = 0;
        for (int num : nums) {
            total += num;
        }

        int target = total - x;

        if (target == 0)
            return n;
        if (target < 0)
            return -1;

        int sum = 0;
        int longest = -1;
        int l = 0;

        for (int r = 0; r < n; r++) {
            sum += nums[r];
            while (sum > target && l < r) {
                sum -= nums[l];
                l++;
            }
            if (sum == target) {
                longest = Math.max(longest, r - l + 1);
            }
        }
    return longest == -1 ? -1 : n - longest;
    }
}
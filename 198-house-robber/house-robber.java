class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        return helper(0, n, nums, dp);
       

    }

    int helper(int ind, int n, int arr[], int dp[]) {
        if (ind >= n) {
            return 0;
        }
        if (dp[ind] != -1) {
            return dp[ind];
        }
        int pick = arr[ind] + helper(ind + 2, n, arr, dp);
        int notpick = helper(ind + 1, n, arr, dp);
        return dp[ind] = Math.max(pick,notpick);

    }
    //  REcursive Solution O(2^400) TLE
    // int helper(int ind,int n, int arr[]) {
    //     if(ind >= n) {
    //         return 0;
    //     }
    //     int pick = arr[ind] + helper(ind+2,n,arr);
    //     int notpick = helper(ind+1,n,arr);
    //     return Math.max(pick,notpick);
    // }
}
class Solution {
    public int rob(int[] nums) {
    int n = nums.length;
    int dp[] = new int[n];
    dp[0] = nums[0];
    for(int i=1;i<n;i++) {
        int pick = nums[i];
        if(i > 1) {
            pick += dp[i-2];
        }
        int notPick = dp[i-1];
        dp[i] = Math.max(pick,notPick);
    }
    return dp[n-1];
       

    }
    // MEmoization
    // int helper(int ind, int n, int arr[], int dp[]) {
    //     if (ind >= n) {
    //         return 0;
    //     }
    //     if (dp[ind] != -1) {
    //         return dp[ind];
    //     }
    //     int pick = arr[ind] + helper(ind + 2, n, arr, dp);
    //     int notpick = helper(ind + 1, n, arr, dp);
    //     return dp[ind] = Math.max(pick,notpick);

    // }
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
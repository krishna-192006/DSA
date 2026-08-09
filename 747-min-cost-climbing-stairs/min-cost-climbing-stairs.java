class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // int n = cost.length;
        // // return Math.min(helper(n-1,cost),helper(n-2,cost));
        // int dp[] = new int[n];
        // Arrays.fill(dp,-1);
        // return Math.min(helper(n - 1, cost, dp),helper(n - 2, cost, dp));
        // TABULATION
        int n = cost.length;
        int dp[] = new int[n];

        dp[0] = cost[0];
        dp[1] = cost[1];

        for(int i=2;i<n;i++) {
            dp[i] = Math.min((cost[i] + dp[i-1]),(cost[i] + dp[i-2]));
        }
        return Math.min(dp[n-1],dp[n-2]);
        
    }
    //MEMOIZATION
    // int helper(int i, int[] arr, int dp[]) {
    //     if (i == 0) {
    //         return arr[0];
    //     }

    //     if (i == 1) {
    //         return arr[1];
    //     }

    //     if(dp[i] != -1){
    //         return dp[i];
    //     }

    //     int oneStep = arr[i] + helper(i - 1, arr, dp);
    //     int twoStep = arr[i] + helper(i - 2, arr, dp);
    //     dp[i] = Math.min(oneStep, twoStep);
    //     return dp[i];
    // }
    // RECURSIVE
    // int helper(int i, int[] arr) {
    //     if(i == 0) {
    //         return arr[0];
    //     } 

    //     if(i == 1) {
    //         return arr[1];
    //     }

    //     int oneStep = arr[i] + helper(i-1,arr);
    //     int twoStep = arr[i] + helper(i-2,arr);

    //     return Math.min(oneStep,twoStep);
    // }
}
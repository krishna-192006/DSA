class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        // return Math.min(helper(n-1,cost),helper(n-2,cost));
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        return Math.min(helper(n - 1, cost, dp),helper(n - 2, cost, dp));
    }

    int helper(int i, int[] arr, int dp[]) {
        if (i == 0) {
            return arr[0];
        }

        if (i == 1) {
            return arr[1];
        }

        if(dp[i] != -1){
            return dp[i];
        }

        int oneStep = arr[i] + helper(i - 1, arr, dp);
        int twoStep = arr[i] + helper(i - 2, arr, dp);
        dp[i] = Math.min(oneStep, twoStep);
        return dp[i];
    }

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
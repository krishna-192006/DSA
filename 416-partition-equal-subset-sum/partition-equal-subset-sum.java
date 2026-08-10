class Solution {
    public boolean canPartition(int[] nums) {
        // TABULATION
        int n = nums.length;
        int total = 0;
        for(int num:nums){
            total += num;
        }

        int target = total / 2;
        if(total % 2 != 0) {
            return false;
        }
        boolean dp[][] = new boolean[n][target+1];

        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }

        if (nums[0] <= target) {
            dp[0][nums[0]] = true;
        }

        for(int i=1;i<n;i++){
            for(int t=1;t<=target;t++){
                boolean notTake = dp[i-1][t];
                boolean take = false;
                if(t >= nums[i]) {
                    take = dp[i-1][t-nums[i]];
                }
                dp[i][t] = take || notTake;
            }
        }
        return dp[n-1][target];
    }
    // MEMOIZATION
    // boolean helper(int i,int target,int arr[],Boolean dp[][]){
        
    //     if(dp[i][target] != null) {
    //         return dp[i][target];
    //     }
    //     if(target == 0) return true;
    //     if(i == 0) return (arr[0] == target);

    //     boolean take = helper(i-1,target,arr,dp);
    //     boolean notTake = false;
    //     if(target >= arr[i]){
    //         notTake = helper(i-1,target-arr[i],arr,dp);
    //     }
    //     return dp[i][target] =  (take || notTake);
    // }
}
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        return helper(0,nums,dp);
    }
    int helper(int i, int arr[],int dp[]) {
        if(i >= arr.length){
            return 0;
        }

        if(dp[i] != -1){
            return dp[i];
        }

        int take = arr[i] + helper(i+2,arr,dp);
        int notTake = helper(i+1,arr,dp);

        return dp[i] = Math.max(take,notTake);
    }
}
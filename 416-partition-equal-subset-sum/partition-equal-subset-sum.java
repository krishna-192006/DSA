class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int total = 0;
        for(int num:nums){
            total += num;
        }

        int target = total / 2;
        if(total % 2 != 0) {
            return false;
        }
        Boolean dp[][] = new Boolean[n][target+1];
        return helper(n-1,target,nums,dp);
    }

    boolean helper(int i,int target,int arr[],Boolean dp[][]){
        
        if(dp[i][target] != null) {
            return dp[i][target];
        }
        if(target == 0) return true;
        if(i == 0) return (arr[0] == target);

        boolean take = helper(i-1,target,arr,dp);
        boolean notTake = false;
        if(target >= arr[i]){
            notTake = helper(i-1,target-arr[i],arr,dp);
        }
        return dp[i][target] =  (take || notTake);
    }
}
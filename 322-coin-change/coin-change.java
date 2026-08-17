class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int dp[][] = new int[n][amount+1];
        for(int row[] : dp ) {
            Arrays.fill(row,-2);
        }
        return helper(n-1,coins,amount,dp);
    }
    int helper(int ind, int[] arr, int target,int [][]dp) {
        if(target == 0) return 0;
        if(dp[ind][target] != -2) {
            return dp[ind][target];
        }
        if(ind == 0) {
            if(target % arr[ind] == 0) return target/arr[ind];
            else return -1;
            }
        int notTake = helper(ind-1,arr,target,dp);
        int take = -1; 
        if(target >= arr[ind]) {
            take =  helper(ind, arr, target - arr[ind],dp);  

            if(take != -1) {
                take = 1+take;
            }
        }

         if (take == -1 && notTake == -1) {
            return dp[ind][target] = -1;
        }
         if (take == -1) {
            return dp[ind][target] = notTake;
        }

        if (notTake == -1) {
            return dp[ind][target] = take;
        }
        return dp[ind][target] = Math.min(take,notTake);

    }
}
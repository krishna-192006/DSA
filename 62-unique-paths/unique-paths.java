class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for(int[] rows : dp) {
            Arrays.fill(rows,-1);
        }
        return helper(m-1,n-1,m,n,dp);
    }
    int helper(int i, int j, int m, int n, int dp[][]) {
        if(i < 0 || j < 0) {
            return 0;
        }

        if(i == 0 && j == 0) {
            return 1;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int take = helper(i-1,j,m,n,dp);
        int notTake = helper(i,j-1,m,n,dp);

        dp[i][j] = take + notTake;

        return dp[i][j];
    }
}
class Solution {
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();

        int dp[][] = new int[n][m];
        for(int row[] : dp) {
            Arrays.fill(row,-1);
        }

        return helper(s.length()-1,t.length()-1,s,t,dp);

    }

    int helper(int i, int j, String s1, String s2,int dp[][]) {
        if(j < 0) {
            return 1;
        }

        if(i < 0) {
            return 0;
        }

        if(dp[i][j] != -1) {
            return dp[i][j];
        }

        if(s1.charAt(i) == s2.charAt(j)) {   // if Character matches
            int take = helper(i-1,j-1,s1,s2,dp);
            int notTake = helper(i-1,j,s1,s2,dp);
             dp[i][j] = take + notTake;
        } else {  // if Character did not match
            dp[i][j] = helper(i-1,j,s1,s2,dp);
        }
         return dp[i][j];

    }
}
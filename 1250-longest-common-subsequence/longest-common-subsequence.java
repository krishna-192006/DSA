class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        // int m = text1.length();
        // int n = text2.length();
        // return helper(m-1,n-1,text1,text2); 
        int m = text1.length();
        int n = text2.length();
        int dp[][] = new int[m][n];
        for(int row[] : dp) {
            Arrays.fill(row,-1);
        }
        return helper(m-1,n-1,text1,text2,dp); 
    }
    // Memoization
     int helper(int ind1, int ind2, String s1, String s2,int dp[][]) {
        if(ind1 < 0 || ind2 < 0) {
            return 0;
        }

        if(dp[ind1][ind2] != -1) {
            return dp[ind1][ind2];
        }

        if(s1.charAt(ind1) == s2.charAt(ind2)) {
            return dp[ind1][ind2] = 1 + helper(ind1-1,ind2-1,s1,s2,dp);
        } else {
           return dp[ind1][ind2] = Math.max(helper(ind1-1,ind2,s1,s2,dp),helper(ind1,ind2-1,s1,s2,dp));
        }
    }
    // Brute Force
    // int helper(int ind1, int ind2, String s1, String s2) {
    //     if(ind1 < 0 || ind2 < 0) {
    //         return 0;
    //     }

    //     if(s1.charAt(ind1) == s2.charAt(ind2)) {
    //        return 1 + helper(ind1-1,ind2-1,s1,s2);
    //     } else {
    //         return Math.max(helper(ind1-1,ind2,s1,s2),helper(ind1,ind2-1,s1,s2));
    //     }
    // }
}
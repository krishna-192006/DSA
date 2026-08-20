class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        // int m = text1.length();
        // int n = text2.length();
        // return helper(m-1,n-1,text1,text2); 
        int m = text1.length();
        int n = text2.length();
        int dp[][] = new int[m+1][n+1];

        for(int j=0;j<=n;j++) {
            dp[0][j] = 0;
        }

        for(int i=0;i<=m;i++) {
            dp[i][0] = 0;
        }

        for(int i=1;i<=m;i++) {
            for(int j=1;j<=n;j++) {
                if(text1.charAt(i-1) == text2.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
         
    }
    // Memoization
    //  int helper(int ind1, int ind2, String s1, String s2,int dp[][]) {
    //     if(ind1 < 0 || ind2 < 0) {
    //         return 0;
    //     }

    //     if(dp[ind1][ind2] != -1) {
    //         return dp[ind1][ind2];
    //     }

    //     if(s1.charAt(ind1) == s2.charAt(ind2)) {
    //         return dp[ind1][ind2] = 1 + helper(ind1-1,ind2-1,s1,s2,dp);
    //     } else {
    //        return dp[ind1][ind2] = Math.max(helper(ind1-1,ind2,s1,s2,dp),helper(ind1,ind2-1,s1,s2,dp));
    //     }
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

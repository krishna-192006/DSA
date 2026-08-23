class Solution {
    public String shortestCommonSupersequence(String text1, String text2) {
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

        String ans ="";
        int i=m,j=n;
        while(i>0 && j>0) {
            if(text1.charAt(i-1) == text2.charAt(j-1)) {
                ans += text1.charAt(i-1);
                i--;
                j--;
            } else if(dp[i-1][j] > dp[i][j-1]) {
                ans += text1.charAt(i-1);
                i--;
            } else {
                ans += text2.charAt(j-1);
                j--;
            }
        }

        while(i > 0) {
            ans += text1.charAt(i-1);
            i--;
        }

        while(j > 0) {
            ans += text2.charAt(j-1);
            j--;
        }
        String rev = "";
        for(int k=ans.length()-1;k>=0;k--){
            rev += ans.charAt(k);
        }
        return rev;
    }
}
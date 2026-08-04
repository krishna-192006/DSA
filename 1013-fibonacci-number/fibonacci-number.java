class Solution {
    public int fib(int n) {
        // Memoization
        // if(n <= 1) return n;
        // int dp[] = new int[n+1];
        // Arrays.fill(dp,-1);
        // if(dp[n] != -1) return dp[n];

        // return dp[n] = fib(n-1) + fib(n-2);

        // Tabulation
        // int dp[] = new int[n+1];
        // dp[0] = 0; 
        // dp[1] = 1; 

        // for(int i=2;i<=n;i++){
        //     dp[i] = dp[i-1] + dp[i-2];
        // }
        // return dp[n];

        // Space Optimization 

        int prev2 = 0;
        int prev = 1;
        if(n == 0) return 0;
        for(int i=2;i<=n;i++){
            int curi = prev + prev2;
            prev2 = prev;
            prev = curi;
        }
    return prev;
    }
}
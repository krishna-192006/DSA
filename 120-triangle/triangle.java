class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int dp[][] = new int[triangle.size()][triangle.size()];
        int n = triangle.size();
        boolean[][] visited = new boolean[n][n];

        return helper(0,0,triangle,dp,visited);
    }
    int helper(int i, int j,List<List<Integer>> triangle, int dp[][], boolean[][] visited){
        if(i ==  triangle.size()- 1) {
            return dp[i][j] = triangle.get(i).get(j);
        }

        if (visited[i][j]) {
            return dp[i][j];
        }

        int down = helper(i+1,j,triangle,dp,visited);
        int diagonal = helper(i+1,j+1,triangle,dp,visited);

        dp[i][j] = triangle.get(i).get(j) + Math.min(down,diagonal);
        visited[i][j] = true;
        return dp[i][j];
    }
}
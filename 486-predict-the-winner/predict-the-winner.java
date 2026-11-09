class Solution {
    public boolean predictTheWinner(int[] nums) {
       return solve(nums,0,nums.length-1) >= 0 ;
        
    }
    int solve(int nums[],int i, int j) {
        if(i == j) {
            return nums[i];
        }

        int first = nums[i] - solve(nums,i+1,j);
        int last = nums[j] - solve(nums,i,j-1);

        return Math.max(first,last);
    }
}
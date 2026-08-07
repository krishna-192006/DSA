class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        return Math.max(help(nums,0,nums.length-1),help(nums,1,nums.length)); 
    }
    int help(int nums[],int start,int n) {
        int prev = nums[start];
        int prev2 = 0;
        for(int i=start+1;i<n;i++) {
            int take = nums[i] ;
            if(i > 1) {
                take += prev2;
            }
            int notTake = prev;
            int curr = Math.max(take,notTake);
            int temp = prev;
            prev = curr;
            prev2 = temp;
        }
        return prev;
    }
}
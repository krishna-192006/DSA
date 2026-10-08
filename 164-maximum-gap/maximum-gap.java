class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        
        if(n < 2) return 0;
        int ans = Integer.MIN_VALUE;

        for(int i=1;i<n;i++){
            int diff = Math.abs(nums[i-1] - nums[i]);
            ans = Math.max(ans,diff);
        }
    return ans;
    }
}
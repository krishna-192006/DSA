class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        return helper(n-1,target,0,nums);
        
    }

    int helper(int ind,int target,int sum,int[] arr) {
        if(ind < 0) {
            if(sum == target) {
                return 1;
            }
        return 0;
        }

    int add = helper(ind-1,target,sum+arr[ind],arr);
    int subtract = helper (ind-1,target,sum-arr[ind],arr);

    return add+subtract;
    }
}
class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int product = 0;
        for(int i=1;i<nums.length;i++) {
            product = (nums[i-1]-1)*(nums[i]-1);
        }
        return product;
    }
}
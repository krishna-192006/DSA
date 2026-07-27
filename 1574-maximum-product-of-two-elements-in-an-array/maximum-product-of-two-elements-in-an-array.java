class Solution {
    public int maxProduct(int[] nums) {
        //Brute Solution is using two for loops 
        // T.C = O(N^2)
        // S.C = O(1)

        // Better Solution
        // T.C = O(NlogN)
        // S.C = O(1)
        // Arrays.sort(nums);
        // int product = 0;
        // for(int i=1;i<nums.length;i++) {
        //     product = (nums[i-1]-1)*(nums[i]-1);
        // }
        // return product;

        // Optimal Solution
        // T.C = O(N)
        // S.C = O(1)

        int n =  nums.length;
        int max1 = 0, max2 = 0;
        for(int i=0;i<n;i++) {
            if(nums[i] >= max1) {
                max2 = max1;
                max1 = nums[i];
            }
            else if(max2 <= nums[i]) {
                max2 = nums[i];
            }
        }
    return (max1 - 1)*(max2 - 1);
    }
}
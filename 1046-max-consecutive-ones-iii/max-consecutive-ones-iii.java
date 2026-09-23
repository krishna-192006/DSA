class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int left = 0,right = 0,c = 0;
        int longest = -1;
        while(right < n) {
            if(nums[right] == 0) c++;
            if(c > k) {
                if(nums[left] == 0) {
                    c--;
                }
            left++;
            }

            if(c <= k) {
                int len = right - left + 1;
                longest =  Math.max(longest,len);
            }
        right++;
        }
    return longest;
    }
}
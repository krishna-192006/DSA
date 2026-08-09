class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int num : nums) {
            int c = 0;
            while(num > 0) {
                c++;
                num = num/10;
            }
            if (c % 2 == 0) {
                ans++;
            }
        }
    return ans;
    }
}
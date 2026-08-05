class Solution {
    public int differenceOfSum(int[] nums) {
        int element_sum = 0;
        int digit_sum = 0;
        for(int ele : nums) {
            element_sum += ele;
            int temp = ele;
            while(temp != 0) {
                digit_sum += temp % 10;
                temp /= 10;
            }
        }
    return Math.abs(element_sum - digit_sum);        
    }
}
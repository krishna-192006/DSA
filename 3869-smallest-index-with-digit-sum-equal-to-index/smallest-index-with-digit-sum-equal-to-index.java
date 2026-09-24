class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        int i=0;
        for(i=0;i<n;i++){
            if(digitSum(nums[i])==i){
                return i;
            }
        }
        return -1;
    }
   public int digitSum(int n){
    int s=0;
      while(n>0){
        s=s+(n%10);
        n=n/10;
      }
      return s;
    }
}
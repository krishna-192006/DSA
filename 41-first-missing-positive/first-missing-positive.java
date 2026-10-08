class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int ele : nums) {
            if(ele > 0) {
                set.add(ele);
            }
        }
    int positive = 1;
        while(set.contains(positive)) {
            positive++;
        } 
    return positive;
    }
}
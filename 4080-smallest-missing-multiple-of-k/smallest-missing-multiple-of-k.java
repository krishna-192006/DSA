class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums) {
            set.add(ele);
        }
        
        int ans = k;
        while(set.contains(ans)) {
            ans += k;
        }
    return ans;
    }
}
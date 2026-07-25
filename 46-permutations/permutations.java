class Solution {
    void Solve(int[] arr, List<Integer> li, List<List<Integer>> res, boolean[] freq) {
        if(li.size() == arr.length){
            res.add(new ArrayList<>(li));
            return;
        } 
        
        for(int i=0;i<arr.length; i++) {
            if(!freq[i]) {
                freq[i] = true;
                li.add(arr[i]);
                Solve(arr,li,res,freq);
                li.remove(li.size()-1);
                freq[i] = false;
            }
        }
    } 
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];
        Solve(nums, new ArrayList<>(), ans,freq);
        return ans;
    }
}
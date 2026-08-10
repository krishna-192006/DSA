class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        Combination(0,candidates,target,ans,0,li);
        return ans;
    }
    void Combination(int idx,int[] arr,int target,List<List<Integer>> ans,int sum, List<Integer> li) {
        if(idx == arr.length) {
        if(sum == target) {
            ans.add(new ArrayList<>(li));
        }
    return;
    }

    if(sum + arr[idx] <= target) {
        li.add(arr[idx]);
        Combination(idx,arr,target,ans,sum+arr[idx],li);
        li.remove(li.size() - 1);
    }
    Combination(idx+1,arr,target,ans,sum,li);

    }
}
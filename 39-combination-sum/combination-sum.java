class Solution {
    void Combination(int idx, int arr[],int sum, int target,List<Integer> li, List<List<Integer>> ans) {
        if(idx == arr.length) {
            if(sum == target) {
               ans.add(new ArrayList<>(li));
            }
        return;
        }

        if(sum + arr[idx] <= target) {
        li.add(arr[idx]);
        // sum += arr[idx];
        Combination(idx,arr,sum + arr[idx],target,li,ans);
        li.remove(li.size()-1);
        }

        
        // sum -= arr[idx];
        Combination(idx+1,arr,sum,target,li,ans);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Combination(0,candidates,0,target,new ArrayList<>(),ans);
        return ans;

    }
}
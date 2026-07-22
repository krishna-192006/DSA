class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> li = new ArrayList<>();
        Arrays.sort(candidates);
        Combination(0,candidates,target,li,new ArrayList<>());
        return li;
    }

    void Combination(int ind,int[] arr,int target, List<List<Integer>> ans,List<Integer> temp) {
        if(target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=ind;i<arr.length;i++){
            if(i > ind && arr[i] == arr[i-1]) {
                continue;
            } 

            if(arr[i] > target) break;
            temp.add(arr[i]);
            Combination(i+1,arr,target-arr[i],ans,temp);
            temp.remove(temp.size()-1);
        }
    }
}
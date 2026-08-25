class Solution {
   void combination(int i,int target,int k, int arr[], List<List<Integer>> li, List<Integer> temp) {
           if(target == 0) {
            if(temp.size() ==  k) {
                li.add(new ArrayList<>(temp));
            }
            return;
           }

           if(i == arr.length) {
            return;
           }

           if(target < 0) {
            return;
           }
            temp.add(arr[i]);
           combination(i+1,target - arr[i], k,arr,li,temp);
           temp.remove(temp.size() - 1);
           combination(i+1,target, k,arr,li,temp);

        }

    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        List<List<Integer>> li = new ArrayList<>();
        combination(0,n,k,nums,li,new ArrayList<>());
        return li;
    }
}
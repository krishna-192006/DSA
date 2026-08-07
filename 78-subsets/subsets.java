class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> li = new ArrayList<>();
       List<Integer> temp = new ArrayList<>();
       mySubsets(0,nums,li,temp); 
       return li;
    }

    void mySubsets(int i,int[] arr, List<List<Integer>> li, List<Integer> temp) {
        if(i == arr.length) {
            li.add(new ArrayList<>(temp));
            return;
        } 
        temp.add(arr[i]);
        mySubsets(i+1,arr,li,temp);
        temp.remove(temp.size()-1);
        mySubsets(i+1,arr,li,temp);
    }
}
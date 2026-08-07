class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> li = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        mySubsets(0,li,temp,nums);
        return li;
    }

    void mySubsets(int i,List<List<Integer>> li, List<Integer>temp, int[]arr) {
        li.add(new ArrayList<>(temp));
        for(int j=i;j<arr.length;j++) {
            if(j>i && arr[j-1] == arr[j]) {
                continue;
            }
            temp.add(arr[j]);
            mySubsets(j+1,li,temp,arr);
            temp.remove(temp.size()-1);
        }
    }
}
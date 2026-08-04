class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> li = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int max = 0, min = 101;
        for(int num : nums) {
            set.add(num);
            max = Math.max(num,max);
            min = Math.min(num,min);
        }
        for(int i=min; i<max; i++){
            if(!set.contains(i)){
                li.add(i);
            }
        }
        return li;
    }
}
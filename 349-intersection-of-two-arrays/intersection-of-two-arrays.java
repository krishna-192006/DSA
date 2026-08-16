class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int num1 : nums1){
            set.add(num1);
        }
        HashSet<Integer> set1 = new HashSet<>();
        for(int num2 : nums2) {
            if(set.contains(num2)) {
                set1.add(num2);
            }
        }
        int result[] = new int[set1.size()];
        int i=0;
        for(int num : set1) {
            result[i++] = num;
        }
    return result;
    }
}
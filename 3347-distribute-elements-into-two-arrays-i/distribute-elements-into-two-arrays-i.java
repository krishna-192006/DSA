class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int res[] = new int[n];

        int r = 0, l = 0;
        arr1[r++] = nums[0];
        arr2[l++] = nums[1];
        for (int k = 2; k < n; k++) {
            if (arr1[r - 1] > arr2[l - 1]) {
                arr1[r++] = nums[k];
            } else {
                arr2[l++] = nums[k];
            }
        }

        int p = 0;

        for (int i = 0; i < r; i++) {
            res[p++] = arr1[i];
        }

        for (int i = 0; i < l; i++) {
            res[p++] = arr2[i];
        }
        return res;
    }
}
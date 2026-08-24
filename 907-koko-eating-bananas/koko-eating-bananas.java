class Solution {
    int hrs(int arr[], int h) {
        int ans = 0;
        for(int ele : arr) {
            ans += Math.ceil((double)ele/h);
        }
        return ans;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int ele : piles) {
            max = Math.max(max,ele);
        }
        int low = 0, high = max;
        int ans = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low + high)/2;
            if(hrs(piles,mid) <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
    return ans;
    }
}
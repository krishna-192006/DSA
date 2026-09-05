class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum1 = 0 , sum2 = 0,ans = 0, max = 0;
        int n = gas.length;

        for(int i=0;i<n;i++) {
            sum1 += gas[i];
            sum2 += cost[i];

            int diff = gas[i] - cost[i];
            max += diff;
            if(max < 0) {
                // max = diff;
                ans  = i+1;
                max = 0;
            }
        }
        return sum2 > sum1  ? -1 : ans;
    }
}
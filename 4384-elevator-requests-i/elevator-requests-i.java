class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int m = requests.length;
        int count = Math.abs(0-requests[0]);
        for(int i=1;i<m;i++) {
            count += Math.abs(requests[i] - requests[i-1]);
        }
        return count;
    }
}
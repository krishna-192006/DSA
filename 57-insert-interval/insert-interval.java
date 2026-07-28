class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        int[][] arr = new int[intervals.length + 1][2];

        for (int i = 0; i < intervals.length; i++) {
            arr[i] = intervals[i];
        }

        arr[intervals.length] = newInterval;

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> ans = new ArrayList<>();
        ans.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int[] last = ans.get(ans.size() - 1);

            if (last[1] >= arr[i][0]) {
                last[1] = Math.max(last[1], arr[i][1]);
            } else {
                ans.add(arr[i]);
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
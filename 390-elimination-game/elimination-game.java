class Solution {
    public int lastRemaining(int n) {
        return helper(n, true);
    }

    int helper(int n, boolean left) {
        if (n == 1) return 1;
        int ans = helper(n / 2, !left);

        if (left) {
            return 2 * ans;
        } else {
            if (n % 2 == 0) {
                return 2 * ans - 1;
            } else {
                return 2 * ans;
            }
        }
    }
}
class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        int n = prices.length;
        int m = discounts.length;
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int i = prices.length-1;
        int j = discounts.length-1;
        double ans = 0;
        while(i >= 0 && j >= 0) {
            double price = (double)(prices[i] * (100.0 - discounts[j]) / 100.0);
            ans += price;
            i--;
            j--;
        }

        while(i >= 0) {
            ans += prices[i];
            i--;
        }
        return ans;
    }
}
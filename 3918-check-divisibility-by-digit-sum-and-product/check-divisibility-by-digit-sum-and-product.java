class Solution {
    public boolean checkDivisibility(int n) {
        int org = n;
        int sum  = 0;
        int product = 1;
        while(n > 0) {
            int temp = n % 10;
            sum += temp;
            product *= temp;
            n = n / 10;
        }
        
        return org % (sum + product) == 0;
    }
}
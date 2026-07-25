class Solution {
    public int maxProduct(int n) {
        int max = -1;
        String s = n + "";
        for(int i=0;i<s.length(); i++){
            for(int j=i+1;j<s.length();j++){
                int a = s.charAt(i) -'0';
                int b = s.charAt(j) -'0';
                max = Math.max(max,a*b);
            }
        }
    return max;
    }
}
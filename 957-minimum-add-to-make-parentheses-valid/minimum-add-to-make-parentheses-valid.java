class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        int ans = 0;
        int openBracket = 0;
        for(int i=0;i<n;i++) {
            if(s.charAt(i) == '(') {
                openBracket++;
            } else {
                if(openBracket > 0) {
                    openBracket--;
                } else {
                    ans++;
                }
            }
        } 
    return ans + openBracket;
    }
}
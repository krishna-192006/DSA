class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                count++;
                if(count > 1) {
                    sb.append(ch);
                }
            } else {
                count--; 
                if(count > 0) {
                    sb.append(ch);
                }
            }
        }
    return sb.toString();
    }
}
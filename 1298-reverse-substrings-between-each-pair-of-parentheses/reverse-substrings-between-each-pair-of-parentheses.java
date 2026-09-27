class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();

        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                st.push(sb.length());
            } else if(ch == ')') {
                int start = st.pop();
                reverse(start,sb.length() -1,sb);
            } else {
                sb.append(ch);
            }
        }
    return sb.toString();
    }

    public void reverse(int start, int end, StringBuilder s) {
        while(start < end) {
            char temp = s.charAt(start);
            s.setCharAt(start,s.charAt(end));
            start++;
            s.setCharAt(end,temp);
            end--;
        }
    }
}
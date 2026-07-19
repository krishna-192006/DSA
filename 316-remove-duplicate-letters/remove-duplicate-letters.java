class Solution {
    public String removeDuplicateLetters(String s) {
        int n = s.length();
        int ch[] = new int[26];
        boolean[] visited = new boolean[26];
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            ch[s.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (visited[c - 'a']) {
                continue;
            }
            while (!st.isEmpty() && st.peek() > c && ch[st.peek() - 'a'] > i) {
                visited[st.pop() - 'a'] = false;
            }

            st.push(c);
            visited[c - 'a'] = true;
        }

    StringBuilder ans = new StringBuilder(); 
   for (char c:st) {
        ans.append(c);
    }

    return ans.toString();
    }

}
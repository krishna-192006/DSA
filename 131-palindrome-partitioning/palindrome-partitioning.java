class Solution {
    void solve(int ind, String s, List<String> li, List<List<String>> res) {
        if (ind == s.length()) {
            res.add(new ArrayList<>(li));
            return;
        }

        for (int i = ind + 1; i <= s.length(); i++) {
            if (isPalindrome(ind,i-1,s)) {
                li.add(s.substring(ind, i));
                solve(i, s, li,res);
                li.remove(li.size() - 1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        solve(0, s, new ArrayList<>(),res);
        return res;
    }

    boolean isPalindrome(int start, int end, String s) {
        while(start < end) {
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
    return true;
    }
}
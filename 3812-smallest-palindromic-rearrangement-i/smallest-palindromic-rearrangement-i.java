class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int half = n/2;
        char[] arr = s.toCharArray();
        Arrays.sort(arr,0,half);
       for (int i = 0; i < half; i++) {
    arr[n - 1 - i] = arr[i];
}
        return new String(arr);

    }
}
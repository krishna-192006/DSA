class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;

        HashSet<Integer> set = new HashSet<>();

        for(int candy : candyType) {
            set.add(candy);
        }

        int min = set.size();
        return Math.min(n/2,min);

    }
}
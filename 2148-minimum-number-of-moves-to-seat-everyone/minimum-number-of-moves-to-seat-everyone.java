class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(students);
        Arrays.sort(seats);
        int min = 0;
        int n = seats.length;
        for(int i=0;i<n;i++) {
            int moves = Math.abs(students[i] - seats[i]);
            min += moves;
        }
        return min;

        
    }
}
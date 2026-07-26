class Solution {
    public int maximumProduct(int[] nums) {
        int largest = -1000;
        int secondLargest = -1000;
        int thirdLargest = -1000;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int ele:nums) {
            if(ele >= largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = ele;
            } else if(ele >= secondLargest ) {
                thirdLargest = secondLargest;
                secondLargest = ele;
            } else if(ele > thirdLargest ) {
                thirdLargest = ele;
            } 

            if (ele <= smallest) {
                secondSmallest = smallest;
                smallest = ele;
            } else if (ele < secondSmallest) {
                secondSmallest = ele;
            }
        }
         return Math.max(largest*secondLargest*thirdLargest,largest*smallest*secondSmallest);
}
}
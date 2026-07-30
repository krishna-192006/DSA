class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        if(flowerbed.length==1&&flowerbed[0]==0) return true;
        for (int i=0;i<flowerbed.length;i++) {
            if (flowerbed[i]==1) {
                i++;
            }
            else if(flowerbed.length>1&&i==flowerbed.length-1&&flowerbed[flowerbed.length-1]==0&&flowerbed[flowerbed.length-2]==0){
                count++;
            }
            else{
                if(i+1<flowerbed.length&&flowerbed[i+1]==0){
                    count++;
                    i++;
                }
            }
        }
       return count>=n?true:false;
    }
}
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

       int length=flowerbed.length;
       if(n==0)
        return true;
      for (int i = 0; i < length; i++) {
            if (flowerbed[i] == 0) {
                boolean left_flower = (i == 0) || (flowerbed[i - 1] == 0);
                boolean right_flower = (i == length - 1) || (flowerbed[i + 1] == 0);
                if (left_flower && right_flower) {
                    flowerbed[i] = 1;
                    n--;
                    if (n == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
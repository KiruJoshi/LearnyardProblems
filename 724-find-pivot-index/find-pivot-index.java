class Solution {
    public int pivotIndex(int[] nums) {

        int pref[] = new int[nums.length];
        pref[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            pref[i] = nums[i] + pref[i - 1];
        }
      
        for (int j = 0; j < pref.length; j++) {// 3
         int left = 0, right = 0;
            if (j != 0) {
                left = pref[j - 1];
            }
            if (j != pref.length - 1) {
                right = pref[(pref.length - 1)] - pref[j];
            }
            if (left == right) {
                return j;
            }

        }
        return -1;
    }
}

/*
 * nums-1,7,3,6,5,6
 * prefix-1,8,11,17,22,28
 * prefix[0]=nums[0];
 * prefix[i]=nums[i]+prefix[i-1];
 */
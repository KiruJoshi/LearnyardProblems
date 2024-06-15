class Solution {
    public int[] arrayChange(int[] nums, int[][] o) {
       for(int i=0 ; i<o.length ; i++){
         int itr = indexOf(o[i][0] , nums);
         nums[itr] = o[i][1];
       }
       return nums;
    }
    public int indexOf(int num  , int [] nums){
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] == num) return i;
        }
        return -1;
    }
}
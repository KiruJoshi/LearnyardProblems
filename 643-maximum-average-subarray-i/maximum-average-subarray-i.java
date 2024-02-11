class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int cSum=0;
        for(int i=0;i<k;i++){
        cSum+=nums[i];
      }
        int finalAns=cSum;
        for(int st=1, en=k;en<nums.length;st++,en++){
            cSum-=nums[st-1];
            cSum+=nums[en];
             finalAns=Math.max(finalAns,cSum);
        }     
       
      return (double)finalAns/k;
    }
}
// 1, 12, -5, -6, 50,3
//1, 3,-5,-6,12,50
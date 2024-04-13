class Solution {
    public int minPairSum(int[] nums) {

      int ans=0,sum=0;
      Arrays.sort(nums);
      for(int i=0,j=nums.length-1;i<j;i++,j--){
         sum=nums[i]+nums[j];
        ans=Math.max(ans,sum);
      }
      return ans; 
    }
}

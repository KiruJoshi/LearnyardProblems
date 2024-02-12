class Solution {
    public int maximumDifference(int[] nums) {
        
            int min_value=nums[0];
            int  diff=-1;
        for(int j=1;j<nums.length;j++){
         
                if(nums[j]>min_value){
                  diff =  Math.max(diff,nums[j]-min_value);
                  
                }
                min_value=Math.min(min_value,nums[j]);
                
            }
         return diff;
    }
}
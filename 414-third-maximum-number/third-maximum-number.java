class Solution {
    public int thirdMax(int[] nums) {

       long firstMax=Long.MIN_VALUE,secondMax=Long.MIN_VALUE,thirdMax=Long.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
           if(firstMax<nums[i]){
               firstMax=nums[i];//3
           }
       } for(int i=0;i<nums.length;i++){
           if(nums[i]!=firstMax && secondMax<nums[i]){
               secondMax=nums[i];
           }
       }
        for(int i=0;i<nums.length;i++){
           if(nums[i]!=firstMax && thirdMax < nums[i] && nums[i]!=secondMax){
               thirdMax=nums[i];
           }
       }
       if (thirdMax != Long.MIN_VALUE)
        {
            return (int)thirdMax;
        }
       return (int)firstMax;

    }

}
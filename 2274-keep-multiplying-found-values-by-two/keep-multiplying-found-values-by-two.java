class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);//1 3 5 6 12
       // System.out.println(Arrays.toString(nums));
        //System.out.println(nums.length);
       for(int i=0;i<nums.length;i++){
        if(nums[i]==original){
            original=original*2;
          }
        //     if(nums[i]!=original){
        //     original=original*2;
        //   } 
        //   System.out.println(original); 
       } 
       return original;
    }
}
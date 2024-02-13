class Solution {
    public long[] findPrefixScore(int[] nums) {
        long result[]=new long[nums.length];
            long ans[]=new long[nums.length];
        int max=0;
       for(int i=0;i<nums.length;i++){
           if(max<nums[i]){
               max=nums[i];
           }
           result[i]=max+nums[i];//4 6 14 12 20
       } 
        ans[0]=result[0];//4
       for(int i=1;i<result.length;i++){
           ans[i]=result[i]+ans[i-1];
       }
      
       return ans;
    }
}

/*
2,3,7,5,10-> 4 6 14 12 20
0 1 2 3 4
4 10 24 36 56

*/
class Solution {
    public int helper(int prev, int current, int[] nums, int dp[][]){
        if(current == nums.length)
            return 0;
         if(prev !=-1 && dp[prev][current]!=-1){
            return dp[prev][current];
         }   
        int taken = 0;
        // for taking previous should be smaller from current element
        if(prev == -1 || nums[prev]< nums[current]){
            taken = 1 + helper(current, current+1, nums, dp);
        }    
        int  notTaken = helper(prev, current+1, nums, dp);
        if(prev != -1){
          dp[prev][current] = Math.max(taken, notTaken);  
        }
        return Math.max(taken, notTaken);
    }
    public int lengthOfLIS(int[] nums) {
        int dp[][] = new int[nums.length+1][nums.length+1];
        for(int[] rows : dp){
            Arrays.fill(rows, -1);
        }
      return helper(-1, 0, nums , dp);  
    }
}

class Solution {
       public static boolean partitionHelper(int index, int target, int[] arr, int dp[][]){
        if(target == 0)
          return true;
        if(index ==0){
          return arr[0] == target ? true : false; 
        }
        if(dp[index][target]!=-1)
           return dp[index][target]==1;
        boolean notTake = partitionHelper(index-1, target, arr, dp);
        boolean taken = false;
        if(target >= arr[index]){
            taken = partitionHelper(index-1, target-arr[index] , arr, dp);
        }
        dp[index][target] = (notTake || taken) ? 1 : 0;
        return dp[index][target] == 1;
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for(int ele:nums){
            sum+= ele;
        }
        if(sum % 2 != 0) return false;
        int target = sum / 2;
        int[][] dp = new int[n][target + 1];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return partitionHelper(n - 1, target, nums, dp);
    }
}


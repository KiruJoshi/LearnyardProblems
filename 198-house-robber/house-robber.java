class Solution {
    public int helper(int[] nums, int i, int[] dp) {
        if (i >= nums.length) {
            return 0;
        }
        if (dp[i] != -1)
            return dp[i];

        // Robber choose to rob this house, then he can rob to next to next house
        int sum1 = nums[i] + helper(nums, i + 2, dp);

        // Robber decided not to rob this house. then he can rob to next house
        int sum2 = helper(nums, i + 1, dp);
        dp[i] = Math.max(sum1, sum2);
        return dp[i];
    }

    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        // Recursion + memoisation = TOP DOWN APPRAOCH
        return helper(nums, 0, dp);
    }
}
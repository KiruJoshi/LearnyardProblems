class Solution {
    public int longestConsecutive(int[] nums) { 
     if (nums.length == 0) return 0;

        Arrays.sort(nums);
        int count = 1, ans = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            int diff = nums[i + 1] - nums[i];
            if (diff == 1) {
                count++;
            } else if (diff > 1) {
                ans = Math.max(ans, count);
                count = 1; // Reset count for a new sequence
            }
        }
        // Final check at the end of the loop
        ans = Math.max(ans, count);
        return ans;
    }
}

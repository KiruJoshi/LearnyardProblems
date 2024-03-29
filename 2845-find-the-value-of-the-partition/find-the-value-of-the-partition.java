class Solution {
    public int findValueOfPartition(int[] nums) {

        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length - 1; i++) {
            ans = Math.min(ans, Math.abs(nums[i] - nums[i + 1]));
        }

        return ans;
    }
}

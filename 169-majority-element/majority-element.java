class Solution {
    public int majorityElement(int[] nums) {
     int N = nums.length;
        Arrays.sort(nums);
        int ans = nums[N/2];
        return ans;
    }
}

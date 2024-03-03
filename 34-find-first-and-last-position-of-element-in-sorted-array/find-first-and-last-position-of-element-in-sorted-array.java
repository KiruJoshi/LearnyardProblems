class Solution {
    public int[] searchRange(int[] nums, int target) {

        int result[] = { -1, -1 };
        if (nums.length == 1 && target == nums[0]) {
            result[0]=0;
            result[1]=0;
            return result;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result[0] = i;
                break;
            }
        }
        for (int i = nums.length - 1; i >=0; i--) {
            if (nums[i] == target) {
                result[1] = i;
                break;
            }
        }
        return result;
    }
}

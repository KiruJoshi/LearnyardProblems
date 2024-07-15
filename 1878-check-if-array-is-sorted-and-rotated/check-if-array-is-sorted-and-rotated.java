class Solution {
    public boolean check(int[] nums) {
        int result[] = Arrays.copyOf(nums, nums.length);
        Arrays.sort(result);
        int length = nums.length;
        while (length-- > 0) {
            int temp = result[result.length - 1];
            for (int i = result.length - 1; i > 0; i--) {
                result[i] = result[i - 1];
            }
            result[0] = temp;
            if (Arrays.equals(nums, result))
            return true;
        }
        
        return false;
    }
}
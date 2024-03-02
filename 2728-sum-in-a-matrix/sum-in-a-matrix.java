class Solution {
    public int matrixSum(int[][] nums) {

        for (int i = 0; i < nums.length; i++) {
            Arrays.sort(nums[i]);
        }
       
        int sum = 0;
        for (int j = nums[0].length - 1; j >= 0; j--) {
             int max = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i][j] > max) {
                    max = nums[i][j];
                }
            }
            sum = sum + max;
        }

        return sum;
    }
}
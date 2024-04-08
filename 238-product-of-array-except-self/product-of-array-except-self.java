class Solution {
    public int[] productExceptSelf(int[] nums) {

        int arr[] = new int[nums.length];
        arr[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            arr[i] = arr[i - 1] * nums[i - 1];
        }
        int val = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            arr[i] = arr[i] * val;
            val *= nums[i];
        }

        return arr;
    }
}
/*
 * nums-1 2 3 4
 * 1 3 6 10
 * arr[0]=nums[0];
 * for(int i=1;length){
 * arr[i]=arr[i]+nums[i]
 * }
 */
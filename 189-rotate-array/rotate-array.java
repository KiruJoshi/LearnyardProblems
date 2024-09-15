class Solution {
       public void rotate(int[] nums, int k) {
        k = k%nums.length;
        k = nums.length-k;
        
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
        reverse(nums, 0, nums.length-1);
    }
    private static void reverse(int arr[], int i, int j){
        while(i<j){
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
    }
}
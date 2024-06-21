class Solution {
    public int dominantIndex(int[] nums) {
     int ans=-1;
     int arr[]=Arrays.copyOf(nums,nums.length);
     Arrays.sort(arr);//0,1,3,6
     int target=arr[arr.length-1];//largest element
     int sec_largest=arr[arr.length-2];
        if(sec_largest*2<=target){
            for(int i=0;i<nums.length;i++){
                if(target==nums[i]){
                    return i;
                }
            }
        }
     return -1;
    }
}
/*
first_max,sec_max
*/
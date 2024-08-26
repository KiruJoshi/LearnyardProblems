class Solution {
    public int findMin(int[] nums) {
        
        int start=1,end=nums.length-1;
        int n=nums.length;
        if(n==0){
            return 0;
        }if(n==1){
            return nums[0];
        }if(n==2){
            return Math.min(nums[0],nums[1]);
        }if(nums[0]<nums[n-1]){
            return nums[0];
        }
        while(start<=end){
        int mid=(start+end)/2;
        if(mid==n-1 || nums[mid]<nums[mid-1] && nums[mid]<nums[mid+1]){
            return nums[mid];
        }
       else if(nums[mid]<nums[end]){
            end=mid-1;
        } else if(nums[mid]>nums[end]){
            start=mid+1;  
        }
      }
      return -1;
    }
}
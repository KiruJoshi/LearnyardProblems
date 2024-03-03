class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int result[]=new int[2];
        int firstOccurence= searchFirst(nums,0,n-1,target);
        int lastOccurence=searchEnd(nums,0,n-1,target);

        result[0]=firstOccurence;
        result[1]=lastOccurence;
        return result;
    }
    public int searchFirst(int nums[], int start,int end,int target){
        int first_position=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]<target){
                start=mid+1;
            } else if(nums[mid]>target){
                end=mid-1;
            } else{
                first_position=mid;
                end=mid-1;
            }
        }
        return first_position;
    }
    public int searchEnd(int nums[], int start,int end,int target){
        int last_position=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]<target){
                start=mid+1;
            } else if(nums[mid]>target){
                end=mid-1;
            } else{
                last_position=mid;
                start=mid+1;
            }
        }
        return last_position;
    }
}

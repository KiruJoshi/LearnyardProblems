class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int start=0,end=arr.length-1;
        int peak=0;
        while(start<end){
          int  mid=(start+end)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            } else if(arr[mid]>arr[mid+1]){
                end=mid;
            }
        }
        return start;
    }
}
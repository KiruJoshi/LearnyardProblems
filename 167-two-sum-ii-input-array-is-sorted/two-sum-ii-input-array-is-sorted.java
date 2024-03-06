class Solution {
    public int binarySearch(int start,int end,int arr[], int target ){
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>target){
                end=mid-1;
            } else if(arr[mid]<target){
                start=mid+1;
            } else{
                ans=mid;
                end=mid-1;
            }
        }
        return ans;
    }
    public int[] twoSum(int[] numbers, int target) {
        int result[]=new int[2];
        int n=numbers.length;
        for(int i=0;i<numbers.length;i++){

              int firstOcc=binarySearch((i+1),(n-1),numbers,target-numbers[i]);
              if(firstOcc!=-1){
                  result[0]=i+1;
                  result[1]=firstOcc+1;
              }
        }
     
        return result;
    }
}
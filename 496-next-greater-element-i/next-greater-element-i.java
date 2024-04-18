class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

     int n=nums1.length;
      int result[]=new int[n]; 
      Arrays.fill(result, -1);
       for(int i=0;i<nums1.length;i++){
      int j=0,ans=-1;
        for(;j<nums2.length;j++){
            if(nums1[i]==nums2[j]){
                break;
            }
         }
    
       for(;j<nums2.length;j++){
            if(nums1[i]<nums2[j]){
               ans=nums2[j];
                break;
            }
         }
        result[i]=ans;
       }
    return result;
    }
}
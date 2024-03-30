class Solution {
    public int averageValue(int[] nums) {

      int ans=0,count=0;
      int n=nums.length;
      for(int i=0;i<n;i++){
        if(nums[i]%2==0 && nums[i]%3==0){
            ans+=nums[i];
            count++;
        }
      } 
      if(count==0){
        return 0;
      } 
      return ans/count;
    }
}
/*
[9,3,8,4,2,5,3,8,6,1]
 Output 3
 Expected 6
*/
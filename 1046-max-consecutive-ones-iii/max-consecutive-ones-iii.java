class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int zero_count=0,l=0,ans=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                zero_count++;
            }
            while(zero_count>k){
                if(nums[l]==0){
                    zero_count--;
                }
                l++;
            }
                    ans=Math.max(ans , r-l+1);

        }
        return ans;
    }
}
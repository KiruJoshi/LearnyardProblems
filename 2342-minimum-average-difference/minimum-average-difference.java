class Solution {
    public int minimumAverageDifference(int[] nums) {
        
        long sum=0,min=Integer.MAX_VALUE,ans=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
       int n= nums.length;
        long leftSum=0,rightSum=0;
        for(int i=0;i<nums.length-1;i++){
            leftSum+=nums[i];
            rightSum=sum-leftSum;
            long diff=(leftSum/(i+1))-(rightSum/(n-i-1));
           diff= Math.abs(diff);
            if(diff<min){
                min=diff;
                ans=i;
            }

        }
        if(sum/n<min){
            ans=n-1;
        }
        return (int)ans;
    }
}
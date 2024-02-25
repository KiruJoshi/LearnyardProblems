class Solution {
    public boolean check(int[] nums) {

        int ans[] = Arrays.copyOf(nums, nums.length);
        Arrays.sort(ans);
        if (Arrays.equals(nums, ans)) {
            return true;
        }
        boolean flag=false;
        int m=nums.length,temp=0;
        while(m-->0){
            temp=ans[ans.length-1];
            for(int i=nums.length-1;i>0;i--){
                ans[i]=ans[i-1];
                
            }
            ans[0]=temp;
            if(Arrays.equals(ans,nums)){
                flag=true;
                
            }
        }return flag;
    }
}
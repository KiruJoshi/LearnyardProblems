class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int odd_arr[]=new int[nums.length/2];
        int even_arr[]=new int[nums.length/2];
        int result[]=new int[nums.length];
        int k=0, p=0,m=0,n=0;
        for(int j=0;j<nums.length;j++){//--n
            if(nums[j]>0){
                even_arr[k]=nums[j];
                k++;
            } else{
                odd_arr[p]=nums[j];
                p++;
            }
        }
        for(int i=0;i<nums.length;i=i+2){//i=0,1--n/2
       
           result[i] = even_arr[m];
           result[i+1]=odd_arr[m];
            m++;
        }
       
        return result;
    }
}
//TC-o(n+n/2)--we need to take max so o(n)
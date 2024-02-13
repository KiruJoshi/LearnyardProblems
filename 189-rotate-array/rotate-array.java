class Solution {
    public void rotate(int[] nums, int k) {
       int result[]=new int[nums.length];
        int n= nums.length;
        k%=n;//k>n
       for(int i=0;i<nums.length;i++){
           result[i]=nums[(i+n-k)%n];//0-3
       }
       for(int i=0;i<result.length;i++){
           nums[i]=result[i];
       }
    }
    }

/*
1 2 3 4 5 6 7--7 6 5 4 3 2 1
0 1 2 3 4 5 6---5 6 7 4 3 2 1
5 6 7 1 2 3 4---5 6 7 1 2 3 4 //0+7-3=4
*/
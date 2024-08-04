class Solution {
    public void moveZeroes(int[] nums) {

     ArrayList<Integer> zero_list=new ArrayList<>();
     ArrayList<Integer> nonzero_list=new ArrayList<>();
     int result[]=new int[nums.length];
     for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            zero_list.add(nums[i]);
        } else{
           nonzero_list.add(nums[i]); 
        }
     }
     int m=0;
      for(int i=0;i<nonzero_list.size();i++){
        result[m++]=nonzero_list.get(i);
     }
     for(int i=0;i<zero_list.size();i++){
        result[m++]=zero_list.get(i);
     }   
      for(int j=0;j<result.length;j++){
          nums[j]=result[j];
      }
    }
}
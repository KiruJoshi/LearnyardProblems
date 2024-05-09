class Solution {
    //left shift operator multiply 2
    public boolean helper(int num, int k){
        int count=0;
       for(int i=0;i<32;i++){
        if((num & (1<<i))!=0){//bit set means
            count++;
         }
       }
        if(count==k)
           return true;
         return false;  
       } 
    
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int ans =0;
     for(int i=0; i<nums.size();i++){
        if(helper(i,k)){
            ans+=nums.get(i);
        }
       
     } 
      return ans ;  
    }
  }


class Solution {
    public int[] sortEvenOdd(int[] nums) {

        int result[]=new int[nums.length];
       ArrayList<Integer> even_list=new ArrayList<>();
       ArrayList<Integer> odd_list=new ArrayList<>();
       for(int i=0;i<nums.length;i++){
           if(i%2==1){
             odd_list.add(nums[i]);  
           } else{
               even_list.add(nums[i]);
           }
       } 
       Collections.sort(odd_list);
       Collections.sort(even_list);//no change
       int k=odd_list.size()-1;
       int j=0;
       for(int i=0;i<nums.length;i++){
    
           if(i%2==0){
               result[i]=even_list.get(j++);
           } else{
               result[i]=odd_list.get(k--);
               
           }
       }
    return result;
    }
}

// //4,1,2,3
//   0 1 2 3  
//   4 3 2 1
//   2 3 4 1
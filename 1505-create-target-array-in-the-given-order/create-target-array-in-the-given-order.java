class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
     int target[]=new int[nums.length];
     ArrayList<Integer> list1=new ArrayList<>();
     for(int i=0;i<nums.length;i++){
        list1.add(index[i],nums[i]);
     }
  
      for (int i = 0; i < list1.size(); i++) 
            target[i] = list1.get(i); 
       return target;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer> map=new HashMap<>();
      int result[]=new int[2];
      for(int i=0;i<nums.length;i++){
        int compliment=(target-nums[i]);//7
        if(map.containsKey(compliment)){
             result[0]=map.get(compliment);
            result[1]=i;
            return result;
        }
        map.put(nums[i],i);
      }  
      return result;
    }
}
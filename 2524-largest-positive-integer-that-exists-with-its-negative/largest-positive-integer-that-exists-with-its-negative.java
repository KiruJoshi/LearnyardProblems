class Solution {
    public int findMaxK(int[] nums) {
      Arrays.sort(nums); 
      int ans = -1; 
      Set<Integer> set = new HashSet<>();
      for(int i = 0; i< nums.length; i++){
        set.add(nums[i]);
      }
      for(int i = nums.length-1; i>0; i--){
        if(set.contains(-nums[i])){
            ans = nums[i];
            break;
        }
      }
      return ans;
    }
}
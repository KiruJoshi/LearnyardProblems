class Solution {
    public int distinctAverages(int[] nums) {

     Arrays.sort(nums);
  
     HashSet<Double> set=new HashSet<>();
    int n=nums.length;
    for(int i=0;i<n/2;i++){
     set.add((nums[i] + nums[n-i-1]) / 2.0);
    }
        return set.size();
    }
}
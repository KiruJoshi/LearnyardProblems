class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        HashMap<Integer, Integer> prefix = new HashMap<>();
        int sum = 0, result = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];// 3
            if (sum == goal) {// 3==2
                result++;
            }
                int rem = sum - goal;// 1
                if (prefix.containsKey(rem)) {
                    result += prefix.get(rem);
                }
            
         prefix.put(sum, prefix.getOrDefault(sum, 0) + 1);
        }
        return result;
    }
}
/*
 * 1,0,1,0,1-> 1,1,2,2,3
 * 
 * 
 */
class Solution {
    public boolean canJump(int[] nums) {
      
        int reach[] = new int[nums.length];
        Arrays.fill(reach, Integer.MAX_VALUE);
        int lastIndex = nums.length - 1;
        reach[lastIndex] = 0;
        for (int i = lastIndex - 1; i >= 0; i--) {
            int value = nums[i];//1
            int mn = Integer.MAX_VALUE;

            for (int j = 1; j <= value && (i + j) < nums.length; j++) {
                mn = Math.min(mn, reach[i + j]);

            }
            if (mn != Integer.MAX_VALUE) {
                reach[i] = mn + 1;
            }
        }
        if(reach[0]==Integer.MAX_VALUE){
            return false;
        }
        return true;
    }
}  

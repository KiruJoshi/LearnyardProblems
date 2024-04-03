class Solution {
    public int sumFourDivisors(int[] nums) {
           int ans=0;
        for(int i=0;i<nums.length;i++){
           ans+=findDivisiors(nums[i]);
        }
        return ans;
    }
     public int findDivisiors(int num){
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;
                count++;
                if (i != num / i) {
                    sum += num / i;
                    count++;
                }
            }
        }
        if(count==4){
            return sum;
        }
        return 0;
    }
}
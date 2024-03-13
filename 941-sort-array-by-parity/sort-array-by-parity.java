class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        ArrayList<Integer> even_list=new ArrayList<>();
        ArrayList<Integer> odd_list=new ArrayList<>();
        int result[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even_list.add(nums[i]);
            } else{
                odd_list.add(nums[i]);
            }
        }
         int m = 0, n = 0;
         for (int i = 0; i < result.length; i++) {
        if (m < even_list.size()) {
                result[i] = even_list.get(m);
                m++;
            } else {
                result[i] = odd_list.get(n);
                n++;
            }
            }
        return result;
    }
}
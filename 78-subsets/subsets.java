class Solution {
    public static void helper(List<List<Integer>> ans, List<Integer> temp, int[] nums, int i){
        if(i == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        //we have to choose either to pick it or not
        temp.add(nums[i]);
        helper(ans,temp,nums,i+1);
        //we hv choosen not to pick this element;
        temp.remove(temp.size()-1);
        helper(ans,temp,nums,i+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(ans,temp,nums,0);
        return ans;
    }
}
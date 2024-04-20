class Solution {
    public static void helper(List<List<Integer>> ans, List<Integer> temp, int[] nums, int i,int k){
        if(i == nums.length|| temp.size() > k) {
            if(temp.size() == k)
            ans.add(new ArrayList<>(temp));
            return;
        }
        //we have to choose either to pick it or not
        temp.add(nums[i]);
        helper(ans,temp,nums,i+1,k);
        //we hv choosen not to pick this element;
        temp.remove(temp.size()-1);
        helper(ans,temp,nums,i+1,k);
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int [] nums = new int [n];
        for(int i=0; i<n; i++)
            nums[i] = i+1;
        helper(ans,temp,nums,0,k);
        return ans;
    }
}
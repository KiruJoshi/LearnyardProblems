class Solution {
    public static void combinationSum2Helper(List<List<Integer>> ans, List<Integer> temp, int[] candidates,int i, int target){
        if(target == 0){
            ans.add(new ArrayList<Integer>(temp));
            return;
        }
        if(target < 0 || i >= candidates.length)
            return;
        temp.add(candidates[i]);
        combinationSum2Helper(ans, temp, candidates, i+1, target-candidates[i]);
        temp.remove(temp.size()-1);
        //checking condition not to add duplicates
        while(i + 1 < candidates.length && candidates[i] == candidates[i + 1]){
            i++;
        }
        combinationSum2Helper(ans, temp, candidates, i+1, target);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
         Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        combinationSum2Helper(ans, temp, candidates, 0, target);
        return ans;   
    }
}
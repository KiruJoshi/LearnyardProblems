class Solution {
    public static void combinationSumHelper(List<List<Integer>> ans,List<Integer> temp,int[] candidates,int target, int index){
        if(index >= candidates.length || target < 0)
            return;
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        //we have choosen to pick this element
        temp.add(candidates[index]);
        combinationSumHelper(ans,temp,candidates,(target-candidates[index]),index);
        //decided not to pick this element
        temp.remove(temp.size()-1);
        combinationSumHelper(ans,temp,candidates,target,index+1);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        combinationSumHelper(ans,temp,candidates,target,0);
        return ans; 
    }
}
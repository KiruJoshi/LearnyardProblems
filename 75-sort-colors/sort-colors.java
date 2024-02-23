class Solution {
    public void sortColors(int[] nums) {
        
        ArrayList<Integer> zeroList=new ArrayList<>();
        ArrayList<Integer> oneList=new ArrayList<>();
        ArrayList<Integer> twoList=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroList.add(nums[i]);
            }
            if(nums[i]==1){
                oneList.add(nums[i]);
            }if(nums[i]==2){
                twoList.add(nums[i]);
            }
        }
        zeroList.addAll(oneList);
        zeroList.addAll(twoList);
        for(int i=0;i<zeroList.size();i++){
           nums[i] = zeroList.get(i);
        }
    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        int count=0;
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
       return list.size();
    
    }
}
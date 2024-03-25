class Solution {
    public int repeatedNTimes(int[] nums) {

     Set<Integer> set=new HashSet<>();  
     for(int ele:nums){
        if(set.contains(ele)){
            return ele;
        }
        set.add(ele);
     }
        return -1;
    }
}
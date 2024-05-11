class Solution {
    public int[] numberOfPairs(int[] nums) {
        int arr[] = new int[2];
        int single_ele=0,paired_ele=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
       for(Map.Entry<Integer, Integer> entry:map.entrySet()){
        if(entry.getValue()>=2){
           paired_ele+=(entry.getValue()/2);
           entry.setValue(entry.getValue() % 2); // Update frequency to the remainder after pairing
            }
            if(entry.getValue() == 1) {
                single_ele++;
            }
       }
        arr[0] = paired_ele;
        arr[1] = single_ele;
        return arr;
    }
}
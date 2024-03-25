class Solution {
    public List<Integer> findDuplicates(int[] nums) {

     ArrayList<Integer> list=new ArrayList<>();
     HashMap<Integer, Integer> map=new HashMap<>();
     int n=nums.length;
     for(int i=0; i<n;i++){
        map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
     }  
      for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
         //   System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
         if(entry.getValue()>1){
            list.add(entry.getKey());
         }
     }
        return list;
    }
}
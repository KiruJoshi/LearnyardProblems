class Solution {
    public int sumOfUnique(int[] nums) {

    int sum=0;
    if(nums.length==1){
        return nums[0];
    }
     HashMap<Integer, Integer> map=new HashMap<>();
     for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
     }
      for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
          //  System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        if(entry.getValue()==1){
            sum+=entry.getKey();
           }
        }
   // System.out.println("Map "+map);
    return sum;

    }
}

// [10,6,9,6,9,6,8,7]
//  6 6 6 7 8 9 9 10
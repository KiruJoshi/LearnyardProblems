class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
       int[] ans = new int[queries.length];
       int count = 0;
    HashMap<Integer, Integer> map=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        if(nums[i]==x)
         count++;
    }
    int occurence=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==x)
         map.put(++occurence, i);
    }
    for(int i=0;i<queries.length;i++){
         int value = queries[i];
         if(count>=value)
          ans[i]=map.get(value);
         else
          ans[i]=-1;
    }
    return ans;
   
  
  }
}
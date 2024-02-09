class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        

        int freq[]=new int[nums.length+1];
      //  System.out.println(nums.length);
       ArrayList<Integer> list=new ArrayList<>();
        //fill arrayList
        for(int i=0;i<nums.length;i++){//--n
            freq[nums[i]]++;
        }
      //  System.out.println(freq);
        for(int i=1;i<=nums.length;i++){
            if(freq[i]==0){
                list.add(i);
            }
        }
        return list;
    }
}


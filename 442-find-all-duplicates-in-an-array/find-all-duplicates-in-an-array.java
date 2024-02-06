class Solution {
    public List<Integer> findDuplicates(int[] nums) {
      List<Integer> list=new ArrayList<>();
        int freq[]=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){//--n
            freq[nums[i]]++;
        }
        System.out.println("Printing Freq of each element "+Arrays.toString(nums)+" " +Arrays.toString(freq));
        for(int i=0;i<freq.length;i++) {//--n+1
            if (freq[i] == 2) {
                list.add(i);
            }
        }
        return list;
    }
    
}
//TC-o(n)/
//SC-o(n)
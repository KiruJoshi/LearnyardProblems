class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
     List<List<Integer>> ans=new ArrayList<>();
     int n= nums.length;
     Arrays.sort(nums);
     for(int i=0;i<n;i++){
        int j=i+1;int k=n-1;
        while(j<k){
            int sum=nums[i]+nums[j]+nums[k];
            if(sum==0){
                ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                while(j+1<k && nums[j]==nums[j+1]){
                    j++;
                } while(k-1>j && nums[k]==nums[k-1]){
                    k--;
                }
                j++;k--;
            }
           else if(sum<0){
            j++;
           } else{
            k--;
           }
        }
         while(i+1 < n && nums[i] == nums[i+1])
                i++;
     }   
     return ans;
    }
}
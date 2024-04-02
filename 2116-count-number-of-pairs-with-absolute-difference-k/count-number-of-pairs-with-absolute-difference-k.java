class Solution {
    public int countKDifference(int[] nums, int k) {

    int count=0;
    int n=nums.length;
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(Math.abs(nums[i]-nums[j])==k){
                count++;
            }
        }
    }
    return count;

    }
}

/*
1,2,2,1
1,2
1,2
2,1
2,1
*/
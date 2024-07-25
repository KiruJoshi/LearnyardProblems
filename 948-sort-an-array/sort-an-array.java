class Solution {
    public int[] mTSHelper(int[] left,int[] right){
        int i=0,j=0,k=0;
        int result[]=new int[left.length+right.length];
        while(i<left.length && j<right.length){
           if(left[i]<=right[j]){
            result[k]=left[i];
            i++;
        } else{
            result[k]=right[j];
            j++;
        }
        k++;
     }
     while(i<left.length){
        result[k++]=left[i++];
     } while(j<right.length){
        result[k++]=right[j++];
     }
     return result;
    }

    public int[] sortArray(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }
        int n = nums.length;
        int left[] = Arrays.copyOfRange(nums, 0, n/2);
        int right[] = Arrays.copyOfRange(nums, n / 2, n);
        left = sortArray(left);
        right = sortArray(right);
        return mTSHelper(left, right);
    }
}
class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int N = numbers.length;//4
        int i = 0;
        int j = N-1;//3
        int ans[] = new int[2];
        while (i < j)//(0<1)
        {
            if (numbers[i] + numbers[j] == target)
            {
                ans[0] = i+1;//1
                ans[1] = j+1;//2
                break;
            }
            if (numbers[i] + numbers[j] > target) 
            {
                j-- ;
            } else 
            {
                i++ ;
            }
        }
        return ans;
    }
}
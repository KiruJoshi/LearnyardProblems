class Solution {
    public static int reverse(int num) {
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10; // Extract the last digit
            reversedNum = reversedNum * 10 + digit; // Multiply the existing reversed number by 10 and add the extracted digit
            num /= 10; // Move to the next digit
        }
        return reversedNum;
    }
    public int countDistinctIntegers(int[] nums) {
        int count=0,j=0;
        int arr[]=new int[nums.length];
        for(int i = 0; i<nums.length; i++){
           arr[j++] = reverse(nums[i]);
        }
      //  System.out.println(Arrays.toString(arr));
        int len1 = nums.length;
        int len2 = arr.length;
        int[] mergedArray = new int[len1 + len2];
        
        // Copy elements from arr1 to mergedArray
        System.arraycopy(nums, 0, mergedArray, 0, len1);
        
        // Copy elements from arr2 to mergedArray
        System.arraycopy(arr, 0, mergedArray, len1, len2);
        
       //  System.out.println(Arrays.toString(mergedArray));
         ArrayList<Integer> list =new ArrayList<>();
         HashMap<Integer,Integer> map=new HashMap<>();
         for(int i = 0; i<mergedArray.length; i++){
            if(!map.containsKey(mergedArray[i])){
                 map.put(mergedArray[i],map.getOrDefault(mergedArray[i], 0) + 1);
            }
         
         }
        return map.size();
    }
}
/**
1 13 10 12 31 1 31 1 21 13
1 13 10 12 21 31
 */
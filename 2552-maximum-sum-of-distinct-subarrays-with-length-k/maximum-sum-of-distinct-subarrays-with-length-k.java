class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();

        long currentSum = 0,maxSum = 0;
        int n = arr.length, left = 0, i = 0;

        // Iterating for length k
        while (i < k && i < n) {
            currentSum += arr[i];
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
            i++;
        }

        // If distinct elements present in map
        // equal to k
        if (mp.size() == k) {
            maxSum = currentSum;
        }

        // Iterating over the left array
        for (i = k; i < n; i++) {
            
                mp.put(arr[i], mp.getOrDefault(arr[i],0) + 1);
        

           
                mp.put(arr[left], mp.get(arr[left]) - 1);
                if (mp.get(arr[left]) <= 0) {
                    mp.remove(arr[left]);
                }

                currentSum += arr[i];
                currentSum -= arr[left];

                if (mp.size() == k) {
                    maxSum = Math.max(maxSum, currentSum);
                }

                left++;
            }
    // Returning the maximum sum
    return maxSum;
}

}
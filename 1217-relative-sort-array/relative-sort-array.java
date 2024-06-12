class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
      int resultArray[]=new int[arr1.length];
      HashMap<Integer, Integer> frequencyMap=new HashMap<>();
      for(int i=0;i<arr1.length;i++){
        frequencyMap.put(arr1[i], frequencyMap.getOrDefault(arr1[i],0)+1);
      }  
       List<Integer> result = new ArrayList<>();
        
        // Step 3: Add elements from arr2 to the result list according to the frequency map
        for (int num : arr2) {
            if (frequencyMap.containsKey(num)) {
                int count = frequencyMap.get(num);
                for (int i = 0; i < count; i++) {
                    result.add(num);
                }
                frequencyMap.remove(num); // Remove the element after processing
            }
        }
        
        // Step 4: Add the remaining elements not in arr2, sorted in ascending order
        List<Integer> remainingElements = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                remainingElements.add(num);
            }
        }
        Collections.sort(remainingElements);
        result.addAll(remainingElements);
        
        // Convert the result list to an array
       
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        
        return resultArray;
    }
}
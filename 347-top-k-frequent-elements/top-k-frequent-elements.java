class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int arr[] = new int[k];
       
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Convert HashMap to a List of Map.Entry objects
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(map.entrySet());

        // Sort the list based on values
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        int j=0;
        for (int i = list.size()-1; i >= 0; i--) {
            arr[j] = list.get(i).getKey();
            j++;
            if(j==k){
                break;
            }
        }
        return arr;
    }
}
/*
 * nums=[1,1,1,1,2,2,3,3,3,4], k=2
 * ans=1 , 3
 * 1-4
 * 2-2
 * 3-3
 * 4-1
 * 
 * sort
 * 1-4
 * 3-3
 * 2-2
 * 4-1
 */
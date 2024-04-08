class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
      HashMap<Integer,Integer> map1=new HashMap<>();
      HashMap<Integer,Integer> map2=new HashMap<>();
      ArrayList<Integer> list=new ArrayList<>();
      for(int i=0;i<nums1.length;i++){
        map1.put(nums1[i],map1.getOrDefault(nums1[i],0)+1);
      }
       for(int i=0;i<nums2.length;i++){
        map2.put(nums2[i],map2.getOrDefault(nums2[i],0)+1);
      }  
      // Find the intersection of elements
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            int num = entry.getKey();
            int count1 = entry.getValue();
            int count2 = map2.getOrDefault(num, 0);
            int intersectCount = Math.min(count1, count2);
            for (int i = 0; i < intersectCount; i++) {
                list.add(num);
            }
        }
       int arr[]=new int[list.size()];
       for(int i=0;i<list.size();i++){
        arr[i]=list.get(i);
       }
        return arr;
    }
}
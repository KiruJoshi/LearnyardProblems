class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        ArrayList<Integer> nums1List = new ArrayList<>();
        List<List<Integer>> ansList = new ArrayList<>();
        ArrayList<Integer> nums2List = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        for (int i = 0; i < n1; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < n2; i++) {
            set2.add(nums2[i]);
        }
        for(int i=0;i<n2;i++){
            if(!set1.contains(nums2[i]) && !nums2List.contains(nums2[i])){
                nums2List.add(nums2[i]);
            }
        }
         for(int i=0;i<n1;i++){
            if(!set2.contains(nums1[i]) && !nums1List.contains(nums1[i])){
                nums1List.add(nums1[i]);
            }
        }
       ansList.add(nums1List);
       ansList.add(nums2List);

        return ansList;
    }
}
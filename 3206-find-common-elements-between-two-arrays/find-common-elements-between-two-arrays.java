class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        
        int ans[]=new int[2];
       int n= nums1.length;
       int m= nums2.length;
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        for(int i=0;i<n;i++){
           map1.put(nums1[i],map1.getOrDefault(nums1[i],0)+1);
            }
          for(int i=0;i<m;i++){
           map2.put(nums2[i],map2.getOrDefault(nums2[i],0)+1);
            }    
            int count1=0,count2=0;
        for(int i=0;i<n;i++){
            if(map2.containsKey(nums1[i])){
              count1++;
            }
        }
           ans[0]=count1;
        for(int i=0;i<m;i++){
            if(map1.containsKey(nums2[i])){
           count2++;
            }
        }
        System.out.println("count2 "+count2);
          ans[1]=count2;
        return ans;
    }
}
/*

nums1 = [4,3,2,3,1], nums2 = [2,2,5,2,3,6]


*/
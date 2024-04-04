class Solution {
    public int findLucky(int[] arr) {

      HashMap<Integer, Integer> map=new HashMap<>(); 
      for(int i=0;i<arr.length;i++){
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
      } 
    // System.out.println("map  "+map);

      int maxElement=-1;
      for(int ele:arr){
        if(map.get(ele)==ele){
         maxElement=Math.max(ele,maxElement);
       //  System.out.println("maxElement "+maxElement);
        }
     //    return maxElement;
      }
 
      return maxElement;
    }
}
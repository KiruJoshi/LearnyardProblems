class Solution {
    public int[] replaceElements(int[] arr) {
      int result[]=new int[arr.length];
      for(int i=0;i<arr.length;i++){
        int maxRight=0;
        for(int j=i+1;j<arr.length;j++){
            maxRight=Math.max(maxRight,arr[j]);
            result[i]=maxRight;
        }
        result[result.length-1]=-1;
      }  
      return result;
    }
}
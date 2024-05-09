class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int xor1=0, xor2=0;
      for(int ele: arr2){
        xor2=xor2^ele;
        }  
       for(int ele:arr1){
        xor1=xor1^(ele&xor2);
       }
       return xor1;
    }
}
class Solution {
    public boolean hasAlternatingBits(int n) {
      boolean result = true;
      String ans = Integer.toBinaryString(n);
      //System.out.println(ans);
      for(int i=0;i<ans.length()-1;i++){
        if(ans.charAt(i)==ans.charAt(i+1)){
            result = false;
        }
      }
      return result;  
    }
}
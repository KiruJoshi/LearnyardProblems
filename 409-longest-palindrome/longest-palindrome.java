class Solution {
    public int longestPalindrome(String s) {

      int count=0;
      HashMap<Character,Integer> map=new HashMap<>();
      for(int i=0;i<s.length();i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
      }  
      int val=0;
      for (Map.Entry<Character, Integer> ite :  map.entrySet()) {
       //  System.out.print(ite.getKey() + ", "); 
          int freq=ite.getValue();
          count+=freq/2;
          if(freq%2!=0){
            val=1;//middle element to placed
          }
      } 
      int ans=(count*2)+val;
      return ans;
    }
}
/*
aaaccc
acaca
*/
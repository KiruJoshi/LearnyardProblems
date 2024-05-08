class Solution {
    public int minSteps(String s, String t) {
        int step = 0;
      HashMap<Character, Integer> map1 = new HashMap<>();
      for(int i = 0; i<s.length(); i++){
        map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i),0)+1);
      }
      
      for(int i=0; i<t.length(); i++){
        char c = t.charAt(i);
         if (map1.containsKey(c) && map1.get(c)>0) {
            map1.put(c, map1.get(c)-1);
         }
          else{
          step++;  
           }
         }
     return step;
    }
}
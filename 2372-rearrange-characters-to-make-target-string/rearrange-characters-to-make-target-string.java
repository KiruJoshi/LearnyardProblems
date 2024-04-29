class Solution {
    public int rearrangeCharacters(String s, String target) {
       int count = Integer.MAX_VALUE;
       HashMap<Character, Integer> map = new HashMap<>();
       for(int i = 0; i<s.length(); i++){
        map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
       } 
      HashMap<Character, Integer> map1 = new HashMap<>();
        for(int i = 0; i<target.length(); i++){
        map1.put(target.charAt(i), map1.getOrDefault(target.charAt(i), 0)+1);
       }
       // System.out.println(map);
       // System.out.println(map1);
       //int freq
        for (Character key : map1.keySet()) {
             int freqOne = map1.getOrDefault(key, 0);
             int freqTwo = map.getOrDefault(key,0);  
             count = Math.min(count,(freqTwo/freqOne)); 
        }
        return count;
    }
}
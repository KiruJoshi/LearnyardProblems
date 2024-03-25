class Solution {
    public boolean areOccurrencesEqual(String s) {

       HashMap<Character, Integer> map = new HashMap<>();
       char[] charArray =  s.toCharArray(); 
       for(int i=0;i<charArray.length;i++){
        map.put(charArray[i],map.getOrDefault(charArray[i],0)+1);
       }
       // Get the count of occurrences of the first character
        int count = map.get(charArray[0]);
        
        // Check if all characters have equal occurrences
        for (int value : map.values()) {
            if (value != count) {
                return false;
            }
        }
        
        return true;
    }
}
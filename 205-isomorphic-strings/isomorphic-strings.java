class Solution {
    public boolean isIsomorphic(String s, String t) {

      
    HashMap<Character, Character> sToT = new HashMap<>();
    HashMap<Character, Character> tToS = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
        char charS = s.charAt(i);
        char charT = t.charAt(i);

        // Check if the mapping is consistent
        if (sToT.containsKey(charS) && sToT.get(charS) != charT) {
            return false;
        }
        if (tToS.containsKey(charT) && tToS.get(charT) != charS) {
            return false;
        }

        // Create mappings
        sToT.put(charS, charT);
        tToS.put(charT, charS);
    }

    return true;
   }
}
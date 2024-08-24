class Solution {
    public boolean isIsomorphic(String s, String t) {
      HashMap<Character, Character> sTot=new HashMap<>();
      HashMap<Character, Character> tTos=new HashMap<>();
      for(int i=0;i<s.length();i++){
        char charS=s.charAt(i);
        char charT=t.charAt(i);

        if(sTot.containsKey(charS) && sTot.get(charS)!=charT)
          return false;
        if(tTos.containsKey(charT) && tTos.get(charT)!=charS)
          return false; 
        sTot.put(charS, charT);
        tTos.put(charT, charS);

      } 
       return true;
    }
}
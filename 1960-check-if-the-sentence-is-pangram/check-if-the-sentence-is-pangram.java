class Solution {
    public boolean checkIfPangram(String sentence) {
        

       HashMap<Character, Integer> map=new HashMap<>();

       int ch=97;

       for(int i=0;i<26;i++){
        map.put((char)ch++,0);
       }
       for(int i=0;i<sentence.length();i++){
        map.put(sentence.charAt(i), map.getOrDefault(sentence.charAt(i),0)+1);
       } 
       ch=97;
        for(int i=0;i<26;i++){
            if(map.get((char)ch++)<1){
                return false;
            }
        }
   
    return true;
    }
}
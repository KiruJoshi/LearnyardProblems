class Solution {
    public int lengthOfLongestSubstring(String s) {

         HashMap<Character, Integer> map = new HashMap<>();
         int j=0,size=0;
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
               while(j<i){
                map.remove(s.charAt(j));
                 j++;
                if(!map.containsKey(s.charAt(i))){
                    
                        break;
                } 
               
               }
            }
      map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
    //  System.out.println(map.size()+ " "+i);
        if(map.size()>size){
            size=map.size();
        }
        }   
       return size;

    }
}
class Solution {
    public int firstUniqChar(String s) {
       LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
       int ans=-1;
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
       // System.out.println(map);
         char ch = '*';
          for(Map.Entry<Character, Integer> iterator:map.entrySet()){
          // System.out.println(iterator.getKey()+ " "+iterator.getValue()); 
           if(iterator.getValue()==1){
                ch = iterator.getKey();
              //   System.out.println(ch);
               break;    
           }
       }
       ans = s.indexOf(ch);
        return ans;
    }
}
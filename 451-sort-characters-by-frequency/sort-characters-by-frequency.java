class Solution {
    public String frequencySort(String s) {
     StringBuilder str = new StringBuilder();
     HashMap<Character, Integer> map = new HashMap<>();
     for(int i=0;i<s.length();i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
     }  
     List<Character> list = new ArrayList<>(map.keySet());
     Collections.sort(list,(a,b)->(map.get(b)-map.get(a)));
     for(Character c:list){
        for(int i=0;i<map.get(c); i++){
            str.append(c);
        }
     }
     return str.toString();
    }
}
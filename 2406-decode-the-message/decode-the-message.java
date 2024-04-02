class Solution {
    public String decodeMessage(String key, String messages) {

     HashMap<Character,Character> map=new HashMap<>();
     int ch=97;
     for(int i=0;i<key.length();i++){
        if(map.containsKey(key.charAt(i)) || key.charAt(i)==' '){
            continue;
        }
        map.put(key.charAt(i),(char)ch++);
     }
     //System.out.println(map);
     StringBuilder str=new StringBuilder();
     for(int i=0;i<messages.length();i++){
        if(messages.charAt(i)==' '){
            str.append(' ');
        } else {
            str.append(map.get(messages.charAt(i)));
        }

     }
     return str.toString();
    }
}
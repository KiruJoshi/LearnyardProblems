class Solution {
    public char repeatedCharacter(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            map.put(charArray[i], map.getOrDefault(charArray[i], 0) + 1);
            if(map.get(charArray[i])==2){
                return charArray[i];
            }
        }
       return '0';
    }
}
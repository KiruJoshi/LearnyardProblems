class Solution {
    public int numberOfSpecialChars(String word) {
        int scount = 0;
        HashSet<Character> lowSet = new HashSet<>();
        HashSet<Character> upSet = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isUpperCase(ch)) {
                upSet.add(ch);
            } else {
                lowSet.add(ch);
            }
        }
        for(Character ele:lowSet){
            if(upSet.contains(Character.toUpperCase(ele))){
                scount++;
            }
        }
        return scount;
    }
}
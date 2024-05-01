class Solution {
    public String reversePrefix(String word, char ch) {
        String result = " ";
        StringBuilder str = new StringBuilder();
        int i = 0;
        for (i = 0; i < word.length(); i++) {
            str.append(word.charAt(i));
            if (word.charAt(i) == ch) {
                str.reverse();
                break;
            }
        }
        for(int j = i+1; j<word.length();j++){
          str.append(word.charAt(j));  
        }
        //System.out.println(str);
        return str.toString();
    }
}
/**
 * x y x z x e z
 * 0 1 2 3 4 5
 * z y x x x e
 */
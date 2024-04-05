class Solution {
    public boolean wordPattern(String pattern, String s) {

        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> map1 = new HashMap<>();
        String str[] = s.split(" ");
         if (pattern.length() != str.length)
          return false;
        for (int i = 0; i < pattern.length(); i++) {
            if (map.get(pattern.charAt(i)) != null && !map.get(pattern.charAt(i)).equals(str[i])) {
                return false;
            }
         map.put(pattern.charAt(i), str[i]);

        }
         for (int i = 0; i < pattern.length(); i++) {
            if (map1.get(str[i]) != null && !map1.get(str[i]).equals(pattern.charAt(i))) {
                return false;
            }
         map1.put(str[i],pattern.charAt(i));

        }
        return true;
    }
}
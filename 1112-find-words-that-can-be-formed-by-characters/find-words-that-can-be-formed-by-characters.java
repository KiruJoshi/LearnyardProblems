class Solution {
    public int countCharacters(String[] words, String chars) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length(); i++) {
            map.put(chars.charAt(i), map.getOrDefault(chars.charAt(i), 0) + 1);
        }
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            int temp = 0;
            String str = words[i];
            HashMap<Character, Integer> map1 = new HashMap<>();
            for (int j = 0; j < str.length(); j++) {
                map1.put(str.charAt(j), map1.getOrDefault(str.charAt(j), 0) + 1);
                if (map.containsKey(str.charAt(j)) && map1.get(str.charAt(j)) <= map.get(str.charAt(j))) {
                    temp++;
                }
            }
            if (temp == str.length()) {
                count += temp;
            }
        }
        return count;
    }
}
class Solution {
    public String frequencySort(String s) {
      StringBuilder result = new StringBuilder();
      LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
      for(int i = 0; i<s.length(); i++){
        map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
      } 

      // Sorting
	List<Character> chars = new ArrayList(map.keySet());
	Collections.sort(chars, (a, b) -> (map.get(b) - map.get(a)));

     
      System.out.println(map.keySet());
      for (Object c : chars) {
		for (int i = 0; i < map.get(c); i++) {
			result.append(c);
		}
	}
      return result.toString();
    }
}
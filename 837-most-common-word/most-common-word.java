class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < banned.length; i++) {
            set.add(banned[i].toLowerCase());
        }
        String[] paraArray = paragraph.replaceAll("[^a-zA-Z0-9,\s]", "").toLowerCase().split("[,\\s]+");
        TreeMap<String, Integer> map1 = new TreeMap<>();
        for (int i = 0; i < paraArray.length; i++) {
            if (!set.contains(paraArray[i])) {
                map1.put(paraArray[i], map1.getOrDefault(paraArray[i], 0) + 1);
            }
        }
        System.out.println(map1);
        map1.remove(" ");
        String result = " ";
        for (String key : map1.keySet()) {
            if (result.equals(" ") || map1.get(key) > map1.get(result)) {
                result = key;
            }
        }
        return result;
    }
}
class Solution {
    public int beautySum(String str) {
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = i; j < str.length(); j++) {
                int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
                map.put(str.charAt(j) - 'a', map.getOrDefault(str.charAt(j) - 'a', 0) + 1);
                for (int ele : map.values()) {
                    max = Math.max(ele, max);
                    min = Math.min(ele, min);
                }
                ans += (max - min);
            }
        }
        return ans;
    }
}
/**
 * aabcb
 * a-2
 * b-2
 * c-1
 * 2-1=1
 */
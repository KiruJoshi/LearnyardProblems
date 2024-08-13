class Solution {
    public int lengthOfLongestSubstring(String s) {

        int N = s.length();
        HashSet<Character> hs = new HashSet<>();
        int start = 0;
        int end = 0;
        int ans = 0;
        while (end < N)
        {
            char ch1 = s.charAt(end);
            if (!hs.contains(ch1))
            {
                hs.add(ch1);
                end++;
                ans = Math.max(ans, hs.size());
            } else 
            {
                char ch2 = s.charAt(start);
                hs.remove(ch2);
                start++;
            }
        }
        return ans;
    }
}
class Solution {
    public String removeDuplicates(String s) {

        Stack<Character> st = new Stack<>();
        StringBuilder strBuild = new StringBuilder();
        st.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (!st.empty() && s.charAt(i) == st.peek()) {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }
        for (Character ch : st) {
            strBuild.append(ch);
        }
        return strBuild.toString();
    }
}
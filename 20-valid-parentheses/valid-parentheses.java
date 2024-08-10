class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            // if(!st.isEmpty() && )
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[')
                st.push(ch);
            else if (!st.isEmpty() && ch == ')' && st.peek() == '(')
                st.pop();
            else if (!st.isEmpty() && ch == '}' && st.peek() == '{')
                st.pop();
            else if (!st.isEmpty() && ch == ']' && st.peek() == '[')
                st.pop();
            else
                return false;
        }
        if (st.size() > 0)
            return false;
        return true;
    }
}

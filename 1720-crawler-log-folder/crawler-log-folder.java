class Solution {
    public int minOperations(String[] logs) {
        int count = 0;
        Stack<String> st = new Stack<>();
        for (int i = 0; i < logs.length; i++) {
            if (logs[i].equals("../") && !st.isEmpty() )
                st.pop();
            else if(!logs[i].equals("./") && !logs[i].equals("../"))
                st.push(logs[i]);
        }
        return st.size();
    }
}
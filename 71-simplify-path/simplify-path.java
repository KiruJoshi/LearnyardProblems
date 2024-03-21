class Solution {
    public String simplifyPath(String path) {

        Stack<String> st = new Stack<>();
        String[] split = path.split("/");
        int n = split.length;
        StringBuilder strBuild = new StringBuilder();
        for (int i = 1; i < n; i++) {
             if (!st.isEmpty() && split[i].equals("..")) {
                st.pop(); 
            } else if (!split[i].equals("") && !split[i].equals(".") && !split[i].equals("..")) {
                st.push(split[i]);
            } 
        }
          for (String ele : st) {
            strBuild.append("/");
            strBuild.append(ele);
        }
        String ans = strBuild.toString();
        if(ans.length()==0){
            return "/";
        }
        return strBuild.toString();
    }
}
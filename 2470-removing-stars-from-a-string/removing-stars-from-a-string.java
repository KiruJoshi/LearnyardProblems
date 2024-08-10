class Solution {
    public String removeStars(String s) {
        
      Stack<Character> st=new Stack<>();
      StringBuilder strBuild1=new StringBuilder();
 
      for(int i=0;i<s.length();i++){
        if(!st.empty() && s.charAt(i)=='*'){
            st.pop();
        } else if(s.charAt(i)!='*'){
            st.push(s.charAt(i));
        }
      }
      for(Character ch:st){
        strBuild1.append(ch);
      }  
      return strBuild1.toString();
    }
}
/*
lecoe
*/
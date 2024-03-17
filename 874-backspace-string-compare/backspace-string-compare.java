class Solution {
    public boolean backspaceCompare(String s, String t) {

      Stack<Character> st=new Stack<>();
      Stack<Character> st1=new Stack<>();
      StringBuilder strBuild1=new StringBuilder();
      StringBuilder strBuild2=new StringBuilder();
      // st.push(s.charAt(0));
       if(s.charAt(0)!='#'){
        st.push(s.charAt(0));
       }
        if(t.charAt(0)!='#'){
        st1.push(t.charAt(0));
       }
      for(int i=1;i<s.length();i++){
        if(!st.empty() && s.charAt(i)=='#'){
            st.pop();
        } else if(st.empty() && s.charAt(i)=='#'){
            continue;
        }  else{
            st.push(s.charAt(i));
        }
      }  
      for(Character ch:st){
        strBuild1.append(ch);
      }
      // st1.push(t.charAt(0));
      //checking for 2nd string
       for(int i=1;i<t.length();i++){
        if(!st1.empty() && t.charAt(i)=='#'){
            st1.pop();
        } else if(st1.empty() && t.charAt(i)=='#'){
            continue;
        } else{
            st1.push(t.charAt(i));
        }
      }  
      for(Character ch:st1){
        strBuild2.append(ch);
      }
    // System.out.println("st :" +st+ "and st1 :" +st1);
      return strBuild1.toString().equals(strBuild2.toString());
    }
}
/*
ac
ac

ab##->""
a#d#->""

*/
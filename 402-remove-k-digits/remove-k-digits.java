class Solution {
    public String removeKdigits(String num, int k) {

      Stack<Character> st=new Stack<>();
      StringBuilder str=new StringBuilder();
      int n=num.length();
       for(int i = 0; i<n; i++){//200
        while(!st.isEmpty() && st.peek()>num.charAt(i) && k>0){//2>0
            st.pop();
             k--;//0
        }
        st.push(num.charAt(i));//02
       }
       while(k>0){
        st.pop();
        k--;
       }
       if(st.isEmpty()){
        st.push('0');
       }
      while(st.size()!=0){
        str.append(st.peek());
        st.pop();
       }
     //  System.out.println(str);
       while(str.length()>1 && str.charAt(str.length() - 1)=='0'){
       str.deleteCharAt(str.length() - 1);
      }
     return str.reverse().toString();
    }
}

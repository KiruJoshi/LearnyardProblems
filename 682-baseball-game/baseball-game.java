class Solution {
    public int calPoints(String[] operations) {

       Stack<Integer> st=new Stack<>();
     //  st.push(operations[0]);
       int sum=0;
       int n=operations.length;
       for(int i=0;i<n;i++){
         if(operations[i].equals("+")){
            int a=st.peek();
            st.pop();
            int b=st.peek();
            st.push(a);
            st.push(a+b);
        } else if(operations[i].equals("D")){
            st.push(2*st.peek());
        } else if(operations[i].equals("C")){
            st.pop();
        }else {
            st.push(Integer.valueOf(operations[i]));
        }
       }
       for(Integer ele:st){
        sum+=ele;
       }
       return sum;
    }
}
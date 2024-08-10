class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
      int[] result=new int[temperatures.length]; 
      int ans[]=new int[temperatures.length]; 
      Stack<Integer> st=new Stack<>();
      for(int i=temperatures.length-1;i>=0;i--){
        while(!st.isEmpty() && temperatures[st.peek()]<=temperatures[i]){
            st.pop();
        }
        if(st.isEmpty())
           result[i]=i;
        else
          result[i]=st.peek();   
        st.push(i);
      } 
      for(int j=0;j<temperatures.length;j++){
        ans[j]=result[j]-j;
      }
      return ans;
    }
}

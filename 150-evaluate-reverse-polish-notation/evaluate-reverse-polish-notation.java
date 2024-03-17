class Solution {
    private int evaluate(int a, int b,String op){
        if(op.equals("+"))
           return a+b;
         if(op.equals("-"))
            return a-b;
        if(op.equals("*"))
           return a*b;
        return a/b; 
    }
    public int evalRPN(String[] tokens) {

      Stack<Integer> s=new Stack<>();
      for(String token: tokens){
        if(token.equals("+") || token.equals("/") || token.equals("-") || token.equals("*")){
            int b=s.peek();
            s.pop();
             int a=s.peek();
            s.pop();
            s.push(evaluate(a,b,token));
        } else{
           s.push(Integer.parseInt(token)); 
        }
      }  
      return s.peek();
    }
}
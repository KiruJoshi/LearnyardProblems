class MyQueue {

  private  ArrayList<Integer> list;
    private int front;
   
    public MyQueue() {
      list=new ArrayList<>();
      front=0;
    }
    
    public void push(int x) {
        list.add(x);
    }
    
    public int pop() {
        int ans=list.get(front);
        front++;
       return ans;
    }
    
    public int peek() {
        int ans=list.get(front);
        return ans;
    }
    
    public boolean empty() {
        if(list.size()==front)
            return true;
         return false;   
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
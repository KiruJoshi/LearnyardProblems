class MyStack {
    Queue<Integer> que;
    private int front;
    public MyStack() {
        que=new LinkedList<>();
        front=0;
    }
     public void push(int x) {
       que.add(x);
       //fifo
        for (int i=1; i<que.size(); i++) 
        {
            que.add(que.poll());
        }
    }
//1
//2 1  1 2
//3 2 1   1 2 3
    public int pop() {
        return que.poll();
    }

    public int top() {
        return que.peek();
    }

    public boolean empty() {
        if (que.size() == 0)
        {
            return true;
        }
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
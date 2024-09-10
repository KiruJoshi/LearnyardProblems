class MinStack {

    Stack<Integer> Data;
    Stack<Integer> minData;

    public MinStack() {
        Data = new Stack<>();
        minData = new Stack<>();

    }

    public void push(int val) {
        Data.push(val);
        if (minData.size() == 0 || minData.peek() >= val)
        {
            minData.push(val);
        }

    }

    public void pop() {
        if (Data.peek().equals(minData.peek()))
        {
            minData.pop();
        }
        Data.pop();
    }

    public int top() {
        return Data.peek();
    }

    public int getMin() {
        return minData.peek();
    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
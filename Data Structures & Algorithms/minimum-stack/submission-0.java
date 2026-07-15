class MinStack { // Two stack
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || val <= minStack.peek()){ // If empty push to minStack or if val is less than top of minStack, push the val
            minStack.push(val);
        }
    }
    
    public void pop() {
        if(minStack.isEmpty()) return;
        int top = stack.pop();
        if(top == minStack.peek()){
            minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

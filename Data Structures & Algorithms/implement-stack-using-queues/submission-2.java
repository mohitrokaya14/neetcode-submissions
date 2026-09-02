class MyStack {
    Queue<Integer> stack = new LinkedList<>();
    Queue<Integer> queue = new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        int len = stack.size();
        for(int i=0;i<len;i++){
            queue.offer(stack.poll());
        }
        stack.offer(x);
        len = queue.size();
        for(int i=0;i<len;i++){
            stack.offer(queue.poll());
        }
    }
    
    public int pop() {
        return stack.poll();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public boolean empty() {
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
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
class MyQueue {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> st2 = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        int s = st.size();
        for(int i=0;i<s;i++){
            st2.push(st.pop());
        }
        int r = st2.pop();
        s = st2.size();
        for(int i=0;i<s;i++){
            st.push(st2.pop());
        }
        return r;
    }
    
    public int peek() {
        int s = st.size();
        for(int i=0;i<s;i++){
            st2.push(st.pop());
        }
        int r = st2.peek();
        s = st2.size();
        for(int i=0;i<s;i++){
            st.push(st2.pop());
        }
        return r;
    }
    
    public boolean empty() {
        if(st.size()==0){return true;}
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
class StockSpanner {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> st2 = new Stack<>();
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int count=0;
        st.push(price);
        int n=st.size();
        for(int i=0;i<n;i++){
            int temp = st.pop();
            st2.push(temp);
            
            if(temp>price){
                break;
            }
            count++;
        }

        n=st2.size();
        for(int i=0;i<n;i++){
            st.push(st2.pop());
        }

        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
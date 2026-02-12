class StockSpanner {
    Stack<Integer>st;
    Stack<Integer>pt;

    public StockSpanner() {
        st=new Stack<>();
        pt=new Stack<>();
    }
    
    public int next(int price) {
        
        int span=1;
        while(!st.isEmpty()&&st.peek()<=price){
            st.pop();
            span+=pt.pop();
        }
        st.push(price);
        pt.push(span);
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
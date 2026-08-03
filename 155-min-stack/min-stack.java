class MinStack {
    Stack<Integer> st;
    Stack<Integer> rev;
    public MinStack() {
        st=new Stack<>();
        rev=new Stack<>();
    }
    public void push(int val) {
        st.push(val);
        if(rev.isEmpty()) rev.push(val);
        else rev.push(Math.min(val,rev.peek()));
    }
    public void pop() {
        if(!st.isEmpty()){
            st.pop();
            rev.pop();
        }
    }
    public int top() {
        if(!st.isEmpty()) return st.peek();
        return -1;
    }
    public int getMin() {
        if(!rev.isEmpty()) return rev.peek();
        return -1;
    }
}
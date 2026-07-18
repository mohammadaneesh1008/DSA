class MyQueue {
    Stack<Integer> st;
    public MyQueue() {
        st = new Stack<>();
    }
    public void push(int x) {
        Stack<Integer> r = new Stack<>();
        while (!st.isEmpty()) {
            r.push(st.pop());
        }
        r.push(x);
        while (!r.isEmpty()) {
            st.push(r.pop());
        }
    }
    public int pop() {
        return st.pop();
    }
    public int peek() {
        return st.peek();
    }
    public boolean empty() {
        return st.isEmpty();
    }
}
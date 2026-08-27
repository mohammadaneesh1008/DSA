class MyStack {
    Queue<Integer> q;
    public MyStack() {
       q = new LinkedList<>(); 
    }
    public void push(int x) {
        q.add(x);
        int a=q.size();
        while(a>1){
            q.add(q.remove());
            a--;
        }
    }
    
    public int pop() {
        if(!q.isEmpty()) return q.remove();
        return -1;
    }
    public int top() {
        if(!q.isEmpty()) return q.peek();
        return -1;
    }
    public boolean empty() {
        if(q.isEmpty()) return true;
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
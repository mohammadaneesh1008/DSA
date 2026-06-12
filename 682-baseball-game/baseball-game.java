class Solution {
    public int calPoints(String[] op) {
        int ans=0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<op.length;i++){
            if(!st.isEmpty() && op[i].equals("+")){
                int a=st.pop();
                int b=st.pop();
                st.push(b);
                st.push(a);
                st.push(a+b);
            }
            else if(!st.isEmpty() && op[i].equals("D")){
                int p=st.pop();
                st.push(p);
                st.push(2*p);
            }
            else if(!st.isEmpty() && op[i].equals("C")){
                st.pop();
            }
            else{
                st.push(Integer.parseInt(op[i]));
            }
        }
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;
    }
}
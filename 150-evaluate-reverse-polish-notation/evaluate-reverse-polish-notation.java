class Solution {
public int evalRPN(String[] s) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<s.length;i++){
        if(s[i].equals("+")){
                int a=st.pop();
                int b=st.pop();
                st.push(b+a);
                }
        else if(s[i].equals("-")){
                int a=st.pop();
                int b=st.pop();
                st.push(b-a);
                }
        else if(s[i].equals("*")){
                int a=st.pop();
                int b=st.pop();
                st.push(b*a);
                }
        else if(s[i].equals("/")){
                int a=st.pop();
                int b=st.pop();
                st.push(b/a);
                }
        else{
                 st.push(Integer.parseInt(s[i]));
            }
        }
        return st.pop();
    }
}
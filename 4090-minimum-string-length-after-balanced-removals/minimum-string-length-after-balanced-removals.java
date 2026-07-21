class Solution {
    public int minLengthAfterRemovals(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!st.isEmpty() && ch=='a' && st.peek()=='b'){
                st.pop();
            }
            else if(!st.isEmpty() && ch=='b' && st.peek()=='a'){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        return st.size();
    }
}
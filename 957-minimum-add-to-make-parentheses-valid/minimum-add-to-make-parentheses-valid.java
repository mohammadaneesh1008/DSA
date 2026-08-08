class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int i=0;
        int ans=0;
        while(i<s.length() && s.charAt(i)==')') i++;
        ans+=i;
        if(i==s.length()) return ans;
        while(i<s.length()){
            if(s.charAt(i)=='(') st.push(')');
            else{
                if(!st.isEmpty() && st.peek()==')') st.pop();
                else st.push('(');
            }
            i++;
        }
        return ans+st.size();
    }
}
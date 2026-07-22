class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> st = new Stack<>();
        for (int x : nums) {
            st.push((long) x);
            while (st.size()>=2){
                long a=st.pop();
                long b=st.pop();
                if (a==b){
                    st.push(a+b);
                } 
                else{
                    st.push(b);
                    st.push(a);
                    break;
                }
            }
        }
        List<Long> ans = new ArrayList<>(st);
        return ans;
    }
}
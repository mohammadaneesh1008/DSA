class Solution {
    public int[] finalPrices(int[] prices) {
        int[] ans = Arrays.copyOf(prices,prices.length);
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<prices.length;i++){
            while(!st.isEmpty() && prices[i]<=prices[st.peek()]){
                int a=st.pop();
                ans[a]=prices[a]-prices[i];
            }
            st.push(i);
        }
        return ans;
    }
}
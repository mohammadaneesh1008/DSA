class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] ans = new int[s.length()];
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c) set.add(i);
        }
        for(int i=0;i<s.length();i++){
            int mn = Integer.MAX_VALUE;
            for(int x : set){
                mn=Math.min(Math.abs(i-x),mn);
            }
            ans[i]=mn;
        }
        return ans;
    }
}
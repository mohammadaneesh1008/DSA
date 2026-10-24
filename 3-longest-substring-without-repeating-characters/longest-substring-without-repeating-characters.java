class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))) set.add(s.charAt(i));
            else{
                    max=Math.max(max,(i-l));
                    while(s.charAt(l)!=s.charAt(i)){set.remove(s.charAt(l)); l++;}
                    l++;
            }
        }
        max=Math.max(max,s.length()-l);
        if(max==Integer.MIN_VALUE) return s.length();
        return max;
    }
}
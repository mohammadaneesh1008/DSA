class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int[] ans = new int[2];
        int line=0;
        int ele=0;
        int i=0;
        while(i<s.length()){
            line+=widths[(int)s.charAt(i)-97];
            if(line<=100){
                ele++;
                i++;
            }
            else{
                ans[0]++;
                line=0;
                ele=0;
            }
        }
        ans[0]++;
        int c=ele;
        while(c-->0){
            ans[1]+=widths[s.charAt(s.length()-c-1)-'a'];
        }
        return ans;
    }
}
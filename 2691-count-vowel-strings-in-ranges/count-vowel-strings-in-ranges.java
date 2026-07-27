class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n=words.length;
        int[] vowel = new int[n];
        for(int i=0;i<n;i++){
            String s=words[i];
            if((s.charAt(0)=='a' || s.charAt(0)=='e' || s.charAt(0)=='i' || s.charAt(0)=='o' || s.charAt(0)=='u') && (s.charAt(s.length()-1)=='a' || s.charAt(s.length()-1)=='e' || s.charAt(s.length()-1)=='i' || s.charAt(s.length()-1)=='o' || s.charAt(s.length()-1)=='u')){
                vowel[i]=1;
            }
        }
        for(int i=1;i<n;i++){
            vowel[i]+=vowel[i-1];
        }
        int[] ans = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int a=queries[i][0];
            int b=queries[i][1];
            if(a==0){
                ans[i]=vowel[b];
            }
            else{
                ans[i]=vowel[b]-vowel[a-1];
            }
        }
        return ans;
    }
}
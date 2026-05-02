class Solution {
    public int vowelConsonantScore(String s) {
        int v=0; int c=0;
        for(char ch : s.toCharArray()){
            if((int)ch>=97 && (int)ch<=122){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ) v++;
                else c++;
            }
        }
        if(c>0) return v/c;
        return 0;
    }
}
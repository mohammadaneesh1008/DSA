class Solution {
    public String reverseStr(String s, int k) {
       StringBuilder sb = new StringBuilder();
       if(s.length()<k){
        StringBuilder a = new StringBuilder(s);
        return a.reverse().toString();
       }
       int count=0;
       int i=0;
       int j=k;
       while(j<s.length()){
         if(count%2==0){
            StringBuilder a = new StringBuilder(s.substring(i,j));
            sb.append(a.reverse());
            i=j;
            j+=k;
         }
        else{
            StringBuilder a = new StringBuilder(s.substring(i,j));
            sb.append(a);
            i=j;
            j+=k;
        }
        count++;
       }
       if(i<s.length() && count%2!=0) sb.append(s.substring(i,s.length()));
       if(i<s.length() && count%2==0){
            StringBuilder a = new StringBuilder(s.substring(i,s.length()));
            sb.append(a.reverse());
       }
       return sb.toString();
    }
}
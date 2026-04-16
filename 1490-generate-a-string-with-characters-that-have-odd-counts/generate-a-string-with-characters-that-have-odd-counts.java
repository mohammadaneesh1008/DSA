class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if(n%2==0){
            while((n-1)>0){
                sb.append('a');
                n--;
            }
            sb.append('b');
        }
        else{
            while(n>0){
                sb.append('a');
                n--;
            }
        }
        return sb.toString();
    }
}
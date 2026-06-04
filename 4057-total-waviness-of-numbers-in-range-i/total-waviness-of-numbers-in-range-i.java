class Solution {
    public int totalWaviness(int num1, int num2) {
        int count=0;
        for(int i=num1;i<=num2;i++){
            String a = i+"";
            if (a.length()<3){
                continue;
            }
            for(int j=1;j<a.length()-1;j++){
                if((a.charAt(j)-'0'<a.charAt(j-1)-'0' && a.charAt(j)-'0'<a.charAt(j+1)-'0') || (a.charAt(j)-'0'>a.charAt(j-1)-'0' && a.charAt(j)-'0'>a.charAt(j+1)-'0') ){
                    count++;
                }
            }
        }
        return count;
    }
}
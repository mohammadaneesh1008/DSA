class Solution {
    public int minimumRecolors(String s, int k) {
        int i=0; int j=k-1;
        int min=Integer.MAX_VALUE;
        int w=0;
        for(int x=0;x<k;x++){
            if(s.charAt(x)=='W') w++;
        }
        while(j<s.length()){
            min=Math.min(min,w);
            j++;
            i++;
            if(j<s.length() && s.charAt(j)=='W') w++;
            if(s.charAt(i-1)=='W') w--;
        }
        return min;
    }
}
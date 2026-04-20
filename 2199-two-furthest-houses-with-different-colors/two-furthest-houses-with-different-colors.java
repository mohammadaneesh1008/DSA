class Solution {
    public int maxDistance(int[] colors) {
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<colors.length;i++){
            for(int j=colors.length-1;j>=i;j--){
                if(colors[i]!=colors[j]){
                    mx=Math.max(mx,(j-i));
                    break;
                }
            }
        }
        return mx;
    }
}
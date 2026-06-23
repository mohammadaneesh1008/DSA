class Solution {
    public int pivotInteger(int n) {
        if(n==1) return 1;
        int sum=((n+1)*n)/2;
        for(int i=1;i<n;i++){
            if((((i+1)*i)/2)==(sum-(((i+1)*i)/2))+i){
                return i;
            }
        }
        return -1;
    }
}
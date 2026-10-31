class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] arr = new int[10];
        while(n>0){
            arr[n%10]++;
            n/=10;
        }
        int f=Integer.MAX_VALUE;
        int val=Integer.MAX_VALUE;
        for(int i=0;i<10;i++){
            if(arr[i]!=0) f=Math.min(arr[i],f);
        }
        for(int i=0;i<10;i++){
            if(arr[i]==f) val=Math.min(val,i);
        }
        return val;
    }
}
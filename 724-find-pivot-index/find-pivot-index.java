class Solution {
    public int pivotIndex(int[] arr) {
       if(arr.length==1) return 0;
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        for(int i=0;i<arr.length;i++){
           int l=0;
           if(i>0) l=arr[i-1];
           int r=arr[arr.length-1]-arr[i];
           if(l==r) return i;
        }
        return -1; 
    }
}
class Solution {
    public int pivotIndex(int[] arr) {
        if(arr.length==1) return 0;
        int sum=0;
        for(int i : arr) sum+=i;
        int left=0;
        for(int i=0;i<arr.length;i++){
           int right=sum-left-arr[i];
           if(left==right) return i;
           left+=arr[i];
        }
        return -1; 
    }
}
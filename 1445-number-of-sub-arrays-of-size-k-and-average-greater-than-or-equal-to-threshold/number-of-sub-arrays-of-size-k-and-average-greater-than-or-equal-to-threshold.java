class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int ans=0;
        for(int i=1;i<arr.length;i++){
            arr[i]+=arr[i-1];
        }
        if(arr[k-1]/k>=threshold) ans++;
        for(int i=1;i<arr.length-k+1;i++){
                if((arr[i+k-1]-arr[i-1])/k>=threshold) ans++;
        }
        return ans;
    }
}
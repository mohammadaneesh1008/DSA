class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i=0,j=k,sum=0,count=0;
        while(i<j) sum+=arr[i++];
        if(k==arr.length){
           if((sum/arr.length)>=threshold) count++;
           return count;
        }
        i=0;
        if((sum/k)>=threshold) count++;
        while(j<arr.length){
            sum+=arr[j];
            sum-=arr[i];
            if((sum/k)>=threshold) count++;
            i++;
            j++;
        }
        return count;
    }
}
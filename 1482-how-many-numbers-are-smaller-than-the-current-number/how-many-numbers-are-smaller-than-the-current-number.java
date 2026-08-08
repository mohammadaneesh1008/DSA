class Solution {
    public int binary(int[] arr , int t){
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]<t) i=mid+1;
            else j=mid-1;
        }
        return i;
    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
       int[] copy = new int[nums.length];
       for(int i=0;i<nums.length;i++){
            copy[i]=nums[i];
       }
       Arrays.sort(copy);
       for(int i=0;i<nums.length;i++){
         nums[i]=binary(copy,nums[i]);   
       } 
       return nums; 
    }
}
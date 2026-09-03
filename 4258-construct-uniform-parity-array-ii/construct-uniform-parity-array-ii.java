class Solution {
    public boolean uniformArray(int[] arr) {
        if(arr.length==1) return true;
        boolean flag = true;
        Arrays.sort(arr);
        int n = arr[0];
        if(n%2==0){
             for(int i=1;i<arr.length;i++){
                if(arr[i]%2!=0 && (arr[i]-n)%2!=0){
                    flag=false;
                    break;
                }
             }   
            }
        else{
            for(int i=1;i<arr.length;i++){
                if(arr[i]%2==0 && (arr[i]-n)%2==0){
                    flag=false;
                    break;
                }
             }   
        }
        return flag;
    }
}
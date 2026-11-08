class Solution {
    public void swap(int i,int j,int[] arr){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public List<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int i = 0;
        while(i<n){
            int ele = arr[i];
            if( ele==i+1 || ele==arr[ele-1] || ele<=0 || ele>n ) i++;
            else swap(i,ele-1,arr);
        }
        for(i=0;i<n;i++){
            if(arr[i]!=i+1) ans.add(arr[i]);
        }
        return ans;
    }
}
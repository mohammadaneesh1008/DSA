class Solution {
    public String[] findRelativeRanks(int[] score) {
       int[] arr = new int[score.length];
       for(int i=0;i<score.length;i++){
        arr[i]=score[i];
       }
       Arrays.sort(arr);
       HashMap<Integer,String> map = new HashMap<>();
       for(int i=arr.length-1;i>=0;i--){
        map.put(arr[i],(arr.length-i)+"");
       }
       String[] ans = new String[score.length];
       for(int i=0;i<score.length;i++){
        if(map.get(score[i]).equals("1")){
            ans[i]="Gold Medal";
        }
        else if(map.get(score[i]).equals("2")){
            ans[i]="Silver Medal";
        }
        else if(map.get(score[i]).equals("3")){
            ans[i]="Bronze Medal";
        }
        else{
            ans[i]=map.get(score[i]);
        }
       } 
       return ans;
    }
}
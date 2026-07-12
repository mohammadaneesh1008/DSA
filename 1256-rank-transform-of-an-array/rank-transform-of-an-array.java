class Solution {
    public int[] arrayRankTransform(int[] arr) {
       int[] brr = Arrays.copyOf(arr,arr.length); 
       Arrays.sort(brr);
       HashMap<Integer,Integer> map = new HashMap<>();
       int rank=1;
       for(int i=0;i<brr.length;i++){
        if(!map.containsKey(brr[i])){
            map.put(brr[i],rank);
            rank++;
        }
       }
       for(int i=0;i<brr.length;i++){
        arr[i]=map.get(arr[i]);
       }
       return arr;
    }
}
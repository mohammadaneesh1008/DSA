class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        ArrayList<Integer> l = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : arr){
            if(map.containsKey(x)){
                int a=map.get(x);
                map.put(x,a+1);
            }
            else{
                map.put(x,1);
            }
        }
        for(int x : map.values()){
            l.add(x);
        }
        Collections.sort(l);
        int i=0;
        int sum=0;
        while(sum<k){
            sum+=l.get(i);
            i++;
        }
        if((sum-k)>0) return l.size()-i+1;
        return l.size()-i;
    }
}
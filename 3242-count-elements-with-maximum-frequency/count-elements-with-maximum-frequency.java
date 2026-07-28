class Solution {
    public int maxFrequencyElements(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
       int mx=Integer.MIN_VALUE;
       for(int x : nums){
        if(map.containsKey(x)){
            int a=map.get(x);
            if((a+1)>mx) mx=(a+1);
            map.put(x,a+1);
        }
        else{
            if(1>mx) mx=1;
            map.put(x,1);
        }
       } 
       int count=0;
       for(int x : map.keySet()){
        if(map.get(x)==mx) count+=mx;
       }
       return count;
    }
}
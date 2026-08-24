class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max=-1;
        for(int x : nums){
            int a=x;
            int d=0;
            while(a>0){d+=a%10;a/=10;}
            if(map.containsKey(d)){
                max=Math.max(max,map.get(d)+x);
                map.put(d,Math.max(map.get(d),x));
            }
            else{
                map.put(d,x);
            }
        }
        return max;
    }
}
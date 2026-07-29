class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : arr){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }
            else{
                map.put(x,1);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int x : map.values()) ans.add(x);
        Collections.sort(ans);
        int i=ans.size()-1;
        int sum=0;
        int count=0;
        while(i>=0 && sum<arr.length/2){
            sum+=ans.get(i--);
            count++;
        }
        return count;
    }
}
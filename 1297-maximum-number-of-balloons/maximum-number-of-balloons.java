class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : text.toCharArray()){
            if(ch=='b' || ch=='a' || ch=='l' || ch=='o' || ch=='n'){
                if(map.containsKey(ch)){
                    int a = map.get(ch);
                    map.put(ch,a+1);
                }
                else{
                    map.put(ch,1);
                }
            }
        }
        if(!map.containsKey('b') || !map.containsKey('a') || !map.containsKey('l') || !map.containsKey('o') || !map.containsKey('n')) return 0;
        int bf=map.get('b');
        int af=map.get('a');
        int lf=map.get('l');
        int of=map.get('o');
        int nf=map.get('n');
        int min=Math.min(bf,Math.min(af,nf));
        return Math.min(min,Math.min(lf/2,of/2));
    }
}
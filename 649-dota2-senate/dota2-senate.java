class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> r = new LinkedList<>();
        Queue<Integer> d = new LinkedList<>();
        int max=senate.length();
        for(int i=0;i<senate.length();i++){
            if(senate.charAt(i)=='R') r.add(i);
            else d.add(i);
        }
        while(!r.isEmpty() && !d.isEmpty()){
            int re=r.remove();
            int de=d.remove();
            if(re<de){
                r.add(max++);
                }
            else{
                d.add(max++);
            }
        }
        if(!r.isEmpty()) return "Radiant";
        else return "Dire";
    }
}
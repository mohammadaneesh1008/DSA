class MyHashSet {
    List<Integer> ans;
    public MyHashSet() {
        ans = new ArrayList<>();
    }
    public void add(int key) {
        if(!contains(key)){
            ans.add(key);
        }
    }

    public void remove(int key) {
        for(int i=0;i<ans.size();i++){
            if(ans.get(i)==key){
                ans.remove(i);
                return;
            }
        }
    }
    public boolean contains(int key) {
        for(int i=0;i<ans.size();i++){
            if(ans.get(i)==key){
                return true;
            }
        }
        return false;
    }
}
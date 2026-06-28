class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();
        for(char ch : sentence.toCharArray()){
            set.add(ch);
        }
        for(int i=97;i<=122;i++){
            if(!set.contains((char)i)) return false;
        }
        return true;
    }
}
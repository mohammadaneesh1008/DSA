class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> set = new HashSet<>();
        for(char ch : word.toCharArray()){
            set.add(ch);
        }
        int count=0;
        for(char ch : set){
            int a = (int) ch;
            if(a>=65 && a<=90){
                if(set.contains((char)(a+32))){
                    count++;
                }
            }
        }
        return count;
    }
}
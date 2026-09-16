class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        String a = "AEIOUaeiou";
        int i=0;
        int j=s.length()-1;
        while(i<j){
        if(a.contains(String.valueOf(sb.charAt(i))) && a.contains(String.valueOf(sb.charAt(j)))
){
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
                i++;
                j--;
            }
            else if(a.contains(String.valueOf(sb.charAt(i))) && !a.contains(String.valueOf(sb.charAt(j)))
){
                j--;
            }
            else{
                i++;
            }
        }
        return sb.toString();
    }
}
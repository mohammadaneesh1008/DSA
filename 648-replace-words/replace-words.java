class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        StringBuilder sb = new StringBuilder();
        String[] arr = sentence.split(" ");
        for(int i=0;i<dictionary.size();i++){
            for(int j=0;j<arr.length;j++){
                if( arr[j].length()>=dictionary.get(i).length() && dictionary.get(i).equals(arr[j].substring(0,dictionary.get(i).length()))){
                    arr[j]=arr[j].substring(0,dictionary.get(i).length());
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
            if(i!=arr.length-1) sb.append(' ');
        }
        return sb.toString();
    }
}
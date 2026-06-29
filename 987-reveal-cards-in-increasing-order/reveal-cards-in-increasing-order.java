class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int[] ans = new int[deck.length];
        Arrays.sort(deck);
        Queue<Integer> q = new LinkedList<>();
        for(int j=0;j<deck.length;j++){
                q.add(j);
        }
        for(int j=0;j<deck.length;j++){
            ans[q.poll()]=deck[j];
            q.add(q.poll());
        }
        return ans;
    }
}
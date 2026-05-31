class Solution {
    public boolean asteroidsDestroyed(int mass, int[] arr) {
        Arrays.sort(arr);
        long newmass = mass;
        for (int x : arr) {
            if (x > newmass) {
                return false;
            }
            newmass += x;
        }
        return true;
    }
}
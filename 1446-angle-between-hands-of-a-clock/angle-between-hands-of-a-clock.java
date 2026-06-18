class Solution {
    public double angleClock(int hour, int minutes) {
        double theata = Math.abs((30*hour+0.5*minutes)-6*minutes);
        return Math.min(theata,(360-theata));
    }
}
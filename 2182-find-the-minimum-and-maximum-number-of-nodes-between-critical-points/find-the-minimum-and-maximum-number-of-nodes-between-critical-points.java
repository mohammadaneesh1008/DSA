class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] res = {-1, -1};

        if (head == null || head.next == null || head.next.next == null)
            return res;

        ListNode left = head;
        ListNode mid = head.next;
        ListNode right = head.next.next;

        int index = 1;
        int first = -1;
        int last = -1;
        int minDistance = Integer.MAX_VALUE;

        while (right != null) {
            if ((mid.val > left.val && mid.val > right.val) ||
                (mid.val < left.val && mid.val < right.val)) {

                if (first == -1) {
                    first = index;
                } else {
                    minDistance = Math.min(minDistance, index - last);
                }
                last = index;
            }

            left = left.next;
            mid = mid.next;
            right = right.next;
            index++;
        }

        if (first == -1 || first == last)
            return res;

        res[0] = minDistance;
        res[1] = last - first;
        return res;
    }
}

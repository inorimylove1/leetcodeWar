package leetcode;

/**
 * @ClassName LeetCode142
 * @Description LeetCode142
 * @Author xiaohuang
 * @Date 5/6/2023 2:47 PM
 * @Version 1.0
 */
public class LeetCode142 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                fast = head;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;

    }
}

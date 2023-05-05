package leetcode;

/**
 * @ClassName LeetCode148
 * @Description LeetCode148
 * @Author xiaohuang
 * @Date 4/6/2023 5:48 PM
 * @Version 1.0
 */
public class LeetCode148 {
    static public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode pre = null;
        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        pre.next = null;
        head = sortList(head);
        slow = sortList(slow);
        return merge(head, slow);
    }

    public ListNode merge(ListNode left, ListNode right) {
        ListNode head = new ListNode();
        ListNode pre = head;

        while (left != null && right != null) {
            if (left.val < right.val) {
                pre.next = left;
                pre = pre.next;
                left = left.next;
            } else {
                pre.next = right;
                pre = pre.next;
                right = right.next;
            }
        }
        if (left != null) {
            pre.next = left;
        }
        if (right != null) {
            pre.next = right;
        }
        return head.next;
    }


    public static void main(String[] args) {
        LeetCode148 code148 = new LeetCode148();
//        [4,2,1,3]
        ListNode node4 = new ListNode(3);
        ListNode node3 = new ListNode(1, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(4, node2);

        code148.sortList(node1);
    }
}

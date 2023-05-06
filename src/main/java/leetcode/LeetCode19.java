package leetcode;

/**
 * @ClassName LeetCode19
 * @Description LeetCode19
 * @Author xiaohuang
 * @Date 5/6/2023 2:33 PM
 * @Version 1.0
 */
public class LeetCode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1,head);
        ListNode fast =dummy;
        ListNode slow =dummy;
        for(int i=0;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}

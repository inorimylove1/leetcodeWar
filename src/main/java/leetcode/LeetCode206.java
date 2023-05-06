package leetcode;

/**
 * @ClassName LeetCode206
 * @Description LeetCode206
 * @Author xiaohuang
 * @Date 5/6/2023 2:21 PM
 * @Version 1.0
 */

public class LeetCode206 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next = pre;
            pre=cur;
            cur=temp;
        }
        return pre;
    }
}

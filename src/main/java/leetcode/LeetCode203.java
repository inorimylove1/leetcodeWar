package leetcode;

/**
 * @ClassName LeetCode203
 * @Description LeetCode203
 * @Author xiaohuang
 * @Date 5/6/2023 10:37 AM
 * @Version 1.0
 */
public class LeetCode203 {


    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;
        while(cur!=null){
            if(cur.val==val){
                pre.next = cur.next;
                cur= cur.next;
            }else{
                pre = pre.next;
                cur= cur.next;
            }

        }
        return dummy.next;
    }

}

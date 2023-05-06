package leetcode;

/**
 * @ClassName LeetCode707
 * @Description LeetCode707
 * @Author xiaohuang
 * @Date 5/6/2023 2:03 PM
 * @Version 1.0
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(){}
    ListNode(int val){
        this.val = val;
    }

    ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }

}

class MyLinkedList {
    int size;
    ListNode dummy;


    public MyLinkedList() {
        dummy = new ListNode();
        size = 0;
    }

    public int get(int index) {
        if(index < size){
            ListNode cur=dummy;
            for(int i=0;i<=index;i++){
                cur=cur.next;
            }
            return cur.val;
        }
        return -1;
    }

    public void addAtHead(int val) {
        ListNode next = dummy.next;
        ListNode newNode = new ListNode(val,next);
        dummy.next = newNode;
        size++;
    }

    public void addAtTail(int val) {
        ListNode tail = dummy;
        for(int i=0;i<size;i++){
            tail = tail.next;
        }
        ListNode newNode =new ListNode(val);
        tail.next = newNode;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if(index>size){
            return;
        }
        ListNode insert = dummy;
        for(int i=0;i<index;i++){
            insert = insert.next;
        }
        ListNode newNode = new ListNode(val,insert.next);
        insert.next = newNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if(index>=size){
            return;
        }
        ListNode delete = dummy;
        for(int i=0;i<index;i++){
            delete = delete.next;
        }

        delete.next =delete.next.next;
        size--;
    }
}
public class LeetCode707 {
    public static void main(String[] args) {
        MyLinkedList obj = new MyLinkedList();
        obj.addAtHead(1);
        obj.addAtTail(3);
        obj.addAtIndex(1,2);
        obj.get(1);
    }
}

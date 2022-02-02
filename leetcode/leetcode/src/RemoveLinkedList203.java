import java.util.List;

public class RemoveLinkedList203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode sentinel = new ListNode(-1,head);
        ListNode curr = head,prev = sentinel;
        while (curr != null){
            if (curr.val == val ){
                prev.next=curr.next;
            }else {
                prev = prev.next;
            }
            curr =curr.next;
        }
        return sentinel.next;
    }
    public ListNode removeElements1(ListNode head, int val) {
        if (head == null) return null;
        head.next = removeElements1(head.next,val);
        return head.val==val?head.next:head;

    }


    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

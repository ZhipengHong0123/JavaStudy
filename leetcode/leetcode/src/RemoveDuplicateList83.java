import com.sun.source.tree.BreakTree;

public class RemoveDuplicateList83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode curr = head.next;
        ListNode prev = head;
        while (curr != null){
            if (prev.val == curr.val){
                prev.next=curr.next;
            }else {
                prev=curr;
            }
            curr=curr.next;
        }
        return head;
    }
    public ListNode deleteDuplicates1(ListNode head) {
        if (head==null || head.next == null){
            return head;
        }
        head.next = deleteDuplicates1(head.next);
        head.next = head.next.val == head.val?  head.next.next: head.next;
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

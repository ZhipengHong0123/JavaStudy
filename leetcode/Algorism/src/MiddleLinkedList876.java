import java.util.List;

public class MiddleLinkedList876 {
    public ListNode middleNode(ListNode head) {
        if (head==null){
            return null;
        }
        ListNode middle = head;
        ListNode right = head;
        while (right.next !=null){
            middle=middle.next;
            right=right.next.next;
            if (right==null){
                break;
            }
        }
        return middle;
    }
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){};

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode(int val) {
            this.val = val;
        }
    }
}
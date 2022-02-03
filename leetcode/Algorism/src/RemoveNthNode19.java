import java.util.ArrayList;

public class RemoveNthNode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);
        start.next = head;
        int length = 0;
        ListNode first = head;
        while (first != null) {
            length++;
            first = first.next;
        }
        length -= n;
        first = start;
        while (length > 0) {
            length--;
            first = first.next;
        }
        first.next = first.next.next;
        return start.next;

    }

    public ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode start = new ListNode(0, head);
        ListNode first = start;
        ListNode second = start;
        for (int i = 0; i < n + 1; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return start;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        };

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode(int val) {
            this.val = val;
        }
    }
}

public class RemoveDuplicate82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev = new ListNode(-1, head);
        ListNode curr = head;
        head = prev;
        while (curr != null) {
            if (curr.next != null && curr.next.val == curr.val) {
                while (curr.next != null && curr.next.val == curr.val) {
                    curr = curr.next;
                }
                prev.next = curr.next;
            }else {
                prev = prev.next;
            }
            curr = curr.next;
        }
        return head.next;
    }

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
}

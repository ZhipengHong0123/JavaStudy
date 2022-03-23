import java.util.*;

public class RemoveDuplicateUnsorted1836 {
    public static void main(String[] args) {
        ListNode head = new ListNode(2, new ListNode( 1, new ListNode(1, new ListNode(2))));
        deleteDuplicatesUnsorted(head);
    }

    public static ListNode deleteDuplicatesUnsorted(ListNode head) {
        Map<Integer,Integer> map = new HashMap<>();
        ListNode curr = head;
        while (curr != null){
            map.put(curr.val, map.getOrDefault(curr.val,0)+1);
            curr = curr.next;
        }

        ListNode prev = new ListNode(-1,head);
        curr =head;
        head = prev;
        while (curr != null){
            if (map.get(curr.val) ==1){
                prev.next = curr;
                prev=curr;
                curr = curr.next;
            }else {
                prev.next = curr.next;
                curr = curr.next;
            }

        }
        return head.next;
    }

    public static class ListNode {
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

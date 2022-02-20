package Array;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle141 {
    public static void main(String[] args) {
//        ListNode ln1 = new ListNode(1);
//        ListNode ln2 = new ListNode(4);
//        ListNode ln3 = new ListNode(3);
//        ln1.next = ln2;
//        ln2.next = ln3;
//        ln3.next = ln2;

    }

    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }

    public boolean hasCycle1(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
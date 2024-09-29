package testutil;

import datatype.ListNode;

import java.util.List;

public class ListNodeUtils {
    public static ListNode makeListNode(final int[] array) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        for (int i = 0; i < array.length; i++) {
            ListNode next = new ListNode(array[i]);
            curr.next = next;
            curr = next;
        }

        return dummy.next;
    }

    public static void printListNode(final ListNode listNode) {
        ListNode curr = listNode;
        while (curr != null) {
            System.out.printf("%d ", curr.val);
            curr = curr.next;
        }
    }
}

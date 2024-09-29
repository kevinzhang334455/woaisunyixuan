import datatype.ListNode;
import testutil.ListNodeUtils;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        int carry = 0;
        while (curr1 != null || curr2 != null) {
            int num1;
            int num2;
            ListNode next1;
            ListNode next2;
            if (curr1 != null) {
                num1 = curr1.val;
                next1 = curr1.next;
            } else {
                num1 = 0;
                next1 = null;
            }

            if (curr2 != null) {
                num2 = curr2.val;
                next2 = curr2.next;
            } else {
                num2 = 0;
                next2 = null;
            }

            int total = num1 + num2 + carry;
            curr.next = new ListNode(total % 10);
            carry = total / 10;
            curr = curr.next;
            curr1 = next1;
            curr2 = next2;
        }

        if (carry != 0) {
            curr.next = new ListNode(carry);
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        AddTwoNumbers solution = new AddTwoNumbers();
        ListNode n1 = ListNodeUtils.makeListNode(new int[]{9, 9, 9, 9});
        ListNode n2 = ListNodeUtils.makeListNode(new int[]{9, 9, 9, 9, 9, 9});
        ListNodeUtils.printListNode(solution.addTwoNumbers(n1, n2));
    }
}

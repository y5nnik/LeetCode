package Java;

import java.util.List;

public class AddTwoNumbers_2 {
    public static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        ListNode temp =  new ListNode(-1);
        ListNode current = temp; //pointer

        while (l1 != null || l2 != null || carry == 1) {
            int sum = 0;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carry;
            carry = sum /10;

            current.next = new ListNode(sum%= 10);
            current = current.next; //update pointer
        }

        return temp.next;

    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(3);
        ListNode l11 = new ListNode(4, l1);
        ListNode l111 = new ListNode(2, l11);

        ListNode l2 = new ListNode(4);
        ListNode l22 = new ListNode(6, l2);
        ListNode l222 = new ListNode(5, l22);

        ListNode result = addTwoNumbers(l111, l222);
        for (int i = 0; i < 3; i++) {
            System.out.print(result.val);
            result = result.next;
        }
    }
}

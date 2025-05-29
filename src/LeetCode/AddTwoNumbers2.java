package LeetCode;

public class AddTwoNumbers2 {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode head = new ListNode(0);
    ListNode cur = head;
    int carry = 0;
    while (l1 != null || l2 != null || carry != 0) {
      int digit1 = l1 == null ? 0 : l1.val;
      int digit2 = l2 == null ? 0 : l2.val;

      int sum = digit1 + digit2 + carry;
      int digit = sum % 10;
      carry = sum / 10;

      ListNode newNode = new ListNode(digit);
      cur.next = newNode;
      cur = cur.next;

      l1 = l1 == null ? null : l1.next;
      l2 = l2 == null ? null : l2.next;
    }

    ListNode dummy = head.next;
    dummy.next = null;
    return dummy;
  }
  public static void main(String[] args) {
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(3);

    ListNode l2 = new ListNode(2);
    l2.next = new ListNode(3);
    l2.next.next = new ListNode(4);

    AddTwoNumbers2 solution = new AddTwoNumbers2();
    ListNode result = solution.addTwoNumbers(l1, l2);
    while (result != null) {
      System.out.println(result.val);
    }
  }
}

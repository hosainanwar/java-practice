package LinkedListPrac;

class ListNode {
  int val;
  ListNode next;

  ListNode(int x) {
    this.val = x;
    this.next = null;
  }
}

public class LinkedListPractice {

  public static boolean hasCycle(ListNode head) {
    if (head == null || head.next == null) {
      return false;
    }
    ListNode slow = head;
    ListNode fast = head.next;
    while (fast != slow) {
      if (fast == null || fast.next == null) { return false; }
      slow = slow.next;
      fast = fast.next.next;
    }
    return true;
  }
  public static void main(String[] args) {
    System.out.println("LinkedListPractice");
    ListNode head = new ListNode(1);
    ListNode head2 = new ListNode(2);
    ListNode head3 = new ListNode(3);
    ListNode head4 = new ListNode(4);
    ListNode head5 = new ListNode(5);
    ListNode head6 = new ListNode(3);

    head.next = head2;
    head2.next = head3;
    head3.next = head4;
    head4.next = head5;
    head5.next = head6;
    head6.next = head3;
    System.out.println("Does the list cyclic? " + hasCycle(head));
  }
}

package beikepractice;

public class RemoveDuplicates {
    static class ListNode {
        int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public static void removeDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur != null && cur.next != null && cur.next.next != null) {
            if (cur.val == cur.next.val && cur.val == cur.next.next.val) {
                cur.next.next = cur.next.next.next;
            } else {
                cur = cur.next;
            }
        }
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next.next.next.next= new ListNode(3);
        removeDuplicates(head);
    }
}

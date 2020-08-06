package xiecheng;

import java.util.*;

public class Main1 {
	static class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int k = sc.nextInt();
		String list = input.substring(input.indexOf("[") + 1, input.indexOf("]"));
		String[] node = list.split(",");
		ListNode head = new ListNode(Integer.valueOf(node[0]));
		ListNode cur = head;
		for (int i = 1; i < node.length; i++) {
			ListNode tmp = new ListNode(Integer.valueOf(node[i]));
			cur.next = tmp;
			cur = cur.next;
		}
		System.out.println(printList(reverseKGroup(head, k)));
	}
	
	
	private static ListNode reverseKGroup(ListNode head, int k) {
	    ListNode cur = head;
	    int count = 0;
	    while (cur != null && count != k) { 
	        cur = cur.next;
	        count++;
	    }
	    if (count == k) { 
	        cur = reverseKGroup(cur, k); 
	        
	        while (count-- > 0) {  
	            ListNode tmp = head.next; 
	            head.next = cur; 
	            cur = head; 
	            head = tmp; 
	        }
	        head = cur;
	    }
	    return head;
	}
	
	private static String printList(ListNode head) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		ListNode cur = head;
		while (cur != null) {
			sb.append(cur.val+",");
			cur = cur.next;
		}
		sb.setLength(sb.length() - 1);
		sb.append("]");
		return sb.toString();
	}

}

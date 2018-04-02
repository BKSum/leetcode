package bksum.leetcode.fb.linkedlist;

public class ReverseLinkedList {
	
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
	
	public ListNode reverseListRecursion(ListNode head) {
		if(head == null || head.next == null) {
			return(head);
		}
		ListNode p = reverseListRecursion(head.next);
		head.next.next = head;
		head.next = null;
		return p;

	}
	
	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;
		
		while(curr !=null) {
			ListNode temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;		
		}
		
		return prev;
	}
	
	public static void main(String[] args) {
		ReverseLinkedList rll = new ReverseLinkedList();
		ListNode ln1 = new ListNode(1);
		ln1.next = new ListNode(2);
		ln1.next.next = new ListNode(3);
		ListNode revLn1 = rll.reverseList(ln1);
		while(revLn1!=null) {
			System.out.println(revLn1.val);
			revLn1 = revLn1.next;
		}

	}
}

package bksum.leetcode.fb.linkedlist;

public class AddTwoNums {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode first = l1;
		ListNode second = l2;
		int carry = 0;
		ListNode head = new ListNode(0);
		ListNode currNode = head;
		while(first!=null || second!=null) {
			int x = first!=null ? first.val : 0;
			int y = second!=null ? second.val : 0;
			int value = (x + y + carry) % 10 ;
			carry = (x + y + carry) / 10;
			currNode.next = new ListNode(value);
			currNode = currNode.next;
			if(first!=null) first = first.next;
			if(second!=null) second = second.next;
		}
		if(carry>0) {
			currNode.next = new ListNode(carry);
			currNode = currNode.next;			
		}
		return head.next;
    }

	public static void main(String[] args) {
		ListNode listOne = new ListNode(2);
		listOne.next = new ListNode(4);
		listOne.next.next = new ListNode(3);

		ListNode listTwo = new ListNode(5);
		listTwo.next = new ListNode(6);
		listTwo.next.next = new ListNode(4);
		
		AddTwoNums atn = new AddTwoNums();
		atn.addTwoNumbers(listOne, listTwo);
	}

}

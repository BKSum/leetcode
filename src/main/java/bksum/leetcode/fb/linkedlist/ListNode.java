package bksum.leetcode.fb.linkedlist;

public class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}

	public String toString(){
		StringBuilder sb = new StringBuilder();
		ListNode pointer = this;
		while(pointer!=null){
			sb.append(pointer.val);
			if(pointer.next != null) sb.append("->");
			pointer = pointer.next;
		}
		return sb.toString();
	}
}

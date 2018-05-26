package bksum.leetcode.fb.linkedlist;

public class RemoveNNodeFromList {

    /**
     * Given a linked list, remove the n-th node from the end of list and return its head.
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //reverse list
        int counter=1;
        head = reverseListNode(head);
        ListNode current = head;
        while(current!=null) {
            if(n==1){
                head = current.next;
                break;
            }
            if (counter+1 == n){
                current.next = current.next.next;
                break;
            }
            current = current.next;
            counter++;
        }
        return reverseListNode(head);
    }

    public ListNode reverseListNode(ListNode head){
        ListNode current = head;
        ListNode prev = null;

        while(current != null){
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }
}

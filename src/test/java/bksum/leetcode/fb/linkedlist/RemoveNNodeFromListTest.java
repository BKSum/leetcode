package bksum.leetcode.fb.linkedlist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveNNodeFromListTest {
    private RemoveNNodeFromList removeN;

    @Before
    public void setUp(){
        removeN = new RemoveNNodeFromList();
    }

    @Test
    public void removeNthFromEnd() {
        //Given linked list: 1->2->3->4->5, and n = 2.
        ListNode start = new ListNode(1);
        start.next = new ListNode(2);
        start.next.next = new ListNode(3);
        start.next.next.next = new ListNode(4);
        start.next.next.next.next = new ListNode(5);

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(3);
        expected.next.next.next = new ListNode(5);

        assertEquals(listNodeToString(expected), listNodeToString(removeN.removeNthFromEnd(start, 2)));
    }

    @Test
    public void removeNthFromEnd_2() {
        //Given linked list: 1->2->3->4->5, and n = 2.
        ListNode start = new ListNode(1);
        start.next = new ListNode(2);
        start.next.next = new ListNode(3);
        start.next.next.next = new ListNode(4);
        start.next.next.next.next = new ListNode(5);

        ListNode expected = new ListNode(2);
        expected.next = new ListNode(3);
        expected.next.next = new ListNode(4);
        expected.next.next.next = new ListNode(5);

        assertEquals(listNodeToString(expected), listNodeToString(removeN.removeNthFromEnd(start, 5)));
    }

    @Test
    public void removeNthFromEnd_3() {
        //Given linked list: 1->2->3->4->5, and n = 2.
        ListNode start = new ListNode(1);
        start.next = new ListNode(2);
        start.next.next = new ListNode(3);
        start.next.next.next = new ListNode(4);
        start.next.next.next.next = new ListNode(5);

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(3);
        expected.next.next.next = new ListNode(4);

        assertEquals(listNodeToString(expected), listNodeToString(removeN.removeNthFromEnd(start, 1)));
    }

    @Test(timeout=1000*10)
    public void reverseListNode() {
        ListNode start = new ListNode(1);
        start.next = new ListNode(2);
        start.next.next = new ListNode(3);
        start.next.next.next = new ListNode(4);

        ListNode expected = new ListNode(4);
        expected.next = new ListNode(3);
        expected.next.next = new ListNode(2);
        expected.next.next.next = new ListNode(1);

        assertEquals(listNodeToString(expected), listNodeToString(removeN.reverseListNode(start)));
    }

    @org.jetbrains.annotations.NotNull
    private String listNodeToString(ListNode n){
        StringBuilder output = new StringBuilder();
        while(n!=null){
            output.append(n.val);
            if (n.next !=null) output.append("->");
            n = n.next;
        }
        return output.toString();
    }


}
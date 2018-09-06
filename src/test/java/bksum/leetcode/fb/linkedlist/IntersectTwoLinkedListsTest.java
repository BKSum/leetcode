package bksum.leetcode.fb.linkedlist;

import static org.junit.Assert.*;

public class IntersectTwoLinkedListsTest {

    private IntersectTwoLinkedLists itll;

    @org.junit.Before
    public void setUp() {
        itll = new IntersectTwoLinkedLists();
    }

    @org.junit.Test
    public void getIntersectionNode() {
        ListNode start = new ListNode(1);
        start.next = new ListNode(2);
        start.next.next = new ListNode(4);
        start.next.next.next = new ListNode(5);
        start.next.next.next.next = new ListNode(6);

        ListNode start2 = new ListNode(-1);
        start2.next = new ListNode(-2);
        start2.next.next = new ListNode(-3);
        start2.next.next.next = new ListNode(4);
        start2.next.next.next.next = new ListNode(5);
        start2.next.next.next.next.next = new ListNode(6);

        ListNode expected = new ListNode(4);
        expected.next = new ListNode(5);
        expected.next.next = new ListNode(6);

        String actual = itll.getIntersectionNode(start, start2).toString();
        assertEquals(expected.toString(), actual);
    }

    @org.junit.Test
    public void getIntersectionNode2() {
        ListNode start = new ListNode(1);
        start.next = new ListNode(2);
        start.next.next = new ListNode(4);
        start.next.next.next = new ListNode(5);
        start.next.next.next.next = new ListNode(6);

        ListNode start2 = new ListNode(-1);
        start2.next = new ListNode(-2);
        start2.next.next = new ListNode(-3);
        start2.next.next.next = new ListNode(4);
        start2.next.next.next.next = new ListNode(5);
        start2.next.next.next.next.next = new ListNode(6);

        ListNode expected = new ListNode(4);
        expected.next = new ListNode(5);
        expected.next.next = new ListNode(6);

        assertNull(itll.getIntersectionNode(null, null));
    }

    @org.junit.Test
    public void getIntersectionNode3() {
        ListNode start = new ListNode(1);
        start.next = new ListNode(2);
        start.next.next = new ListNode(3);

        ListNode start2 = new ListNode(1);
        start2.next = new ListNode(2);
        start2.next.next = new ListNode(3);

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(3);

        String actual = itll.getIntersectionNode(start, start2).toString();
        System.out.println(start.toString());
        System.out.println(start2.toString());
        System.out.println(actual.toString());

        assertEquals(expected.toString(), actual);
    }

    @org.junit.Test
    public void reverseNode() {
        ListNode start = new ListNode(1);
        start.next = new ListNode(2);
        start.next.next = new ListNode(3);

        ListNode expected = new ListNode(3);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(1);

        assertEquals(expected.toString(), itll.reverseNode(start).toString());
    }
}
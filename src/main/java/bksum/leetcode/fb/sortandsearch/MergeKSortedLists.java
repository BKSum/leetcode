package bksum.leetcode.fb.sortandsearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeKSortedLists {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ln = new ListNode(-1);
        ListNode head = ln;
        List<Integer> al = new ArrayList<>();
        int counter = 0;
        int counter2 = 0;
        for (ListNode l : lists){
            System.out.println("counter: " + counter);
            counter++;
            while(l!=null){
                System.out.println("counter2: " + counter2);
                counter2++;
                //ln.next = new ListNode(l.val);
                //ln = ln.next;
                al.add(l.val);
                l = l.next;
            }
        }
        Collections.sort(al);
        for(Integer i : al){
            ln.next = new ListNode(i);
            ln = ln.next;
        }
        return head.next;
    }

    public static void main(String[] args){
        ListNode[] lnArray = new ListNode[2];
        ListNode ln1 = new ListNode(1);
        ln1.next = new ListNode(5);
        ListNode ln2 = new ListNode(3);
        ln2.next = new ListNode(6);
        lnArray[0] = ln1;
        lnArray[1] = ln2;
        MergeKSortedLists mksl = new MergeKSortedLists();
        ListNode results = mksl.mergeKLists(lnArray);
        System.out.println("results: " + results);
        ListNode p = results;
        while(p!=null){
            System.out.print(p.val + " -> ");
            p = p.next;
        }
    }
}

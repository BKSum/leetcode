package bksum.leetcode.fb.linkedlist;

public class IntersectTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode revHeadA = reverseNode(headA);
        ListNode revHeadB = reverseNode(headB);
        ListNode origrevHeadA = revHeadA;
        ListNode origrevHeadB = revHeadB;

        ListNode common = null;
        while(revHeadA!=null && revHeadB!=null){
            if(revHeadA.val == revHeadB.val){
                common = revHeadA;
            }else{
                break;
            }
            revHeadA = revHeadA.next;
            revHeadB = revHeadB.next;
        }
        headA = reverseNode(origrevHeadA);
        headB = reverseNode(origrevHeadB);
        if(common == null){
            return null;
        }else {
            while(origrevHeadA != null){
                if(common.val == origrevHeadA.val){
                    return(origrevHeadA);
                }
                origrevHeadA = origrevHeadA.next;
            }
        }
        return common;
    }

    public ListNode reverseNode(ListNode head){
        ListNode current = head;
        ListNode prev = null;
        if(current == null) return null;
        while(current != null){
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }
}

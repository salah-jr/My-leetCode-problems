package com.salah;

// We can solve it with recursion or with a stack.
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while(head != null){
            ListNode nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }

        return prev;
    }
}

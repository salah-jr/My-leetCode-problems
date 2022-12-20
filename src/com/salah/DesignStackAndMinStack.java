package com.salah;
class Node {
    int val;
    int min;
    Node next;
    Node() {}
    Node(int val, int min, Node next) { this.val = val; this.min = min; this.next = next;}
}

public class DesignStackAndMinStack {
    private Node head;

    public void push(int val) {
        if(head == null) head = new Node(val, val, null);
        else head = new Node(val, Math.min(val, head.min), head);
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }
}

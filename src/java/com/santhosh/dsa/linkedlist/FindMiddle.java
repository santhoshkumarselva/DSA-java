package com.santhosh.dsa.linkedlist;

class ListNode {
    int data;
    ListNode next;

    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    public ListNode() {
        this.data = 0;
        this.next = null;
    }

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class FindMiddle {
    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        head.next = new ListNode(10);
        head.next.next = new ListNode(15);
        head.next.next.next = new ListNode(20);
        head.next.next.next.next = new ListNode(25);
        System.out.println(findMiddle(head));
    }

    private static int findMiddle(ListNode head) {
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while(fastPointer.next != null && fastPointer.next.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer.data;
    }
}

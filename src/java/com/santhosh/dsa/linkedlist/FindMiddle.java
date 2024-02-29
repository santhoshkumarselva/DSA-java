package com.santhosh.dsa.linkedlist;

public class FindMiddle {
    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(10);
        head.next.next = new Node(15);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(25);
        System.out.println(findMiddle(head));
    }

    private static int findMiddle(Node head) {
        Node slowPointer = head;
        Node fastPointer = head;
        while(fastPointer.next != null && fastPointer.next.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer.data;
    }
}

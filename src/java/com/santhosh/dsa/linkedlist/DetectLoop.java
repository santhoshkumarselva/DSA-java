package com.santhosh.dsa.linkedlist;

public class DetectLoop {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(7);
        head.next.next = new Node(3);
        head.next.next.next = new Node(6);
        head.next.next.next.next = head.next;
        detectLoop(head);
    }

    public static void detectLoop(Node head) {
        Node slowPtr = head;
        Node fastPtr = head;
        Node intersectPtr = null;
        while(fastPtr != null && fastPtr.next !=null ) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(fastPtr == slowPtr) {
                intersectPtr = slowPtr;
                break;
            }
        }
        if(intersectPtr == null) {
            System.out.println("There is no loop");
            return;
        }
        slowPtr = head;
        while(slowPtr!=intersectPtr) {
            slowPtr = slowPtr.next;
            intersectPtr = intersectPtr.next;
        }
        System.out.println(" The loop start at " + intersectPtr.data);
    }

}

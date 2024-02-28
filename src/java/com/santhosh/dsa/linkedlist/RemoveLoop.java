package com.santhosh.dsa.linkedlist;

import static com.santhosh.dsa.linkedlist.DetectLoop.detectLoop;

public class RemoveLoop {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(7);
        head.next.next = new Node(3);
        head.next.next.next = new Node(6);
        head.next.next.next.next = head.next;
        removeLoop(head);
        detectLoop(head);
    }

    private static void removeLoop(Node head) {
        Node slowPtr = head;
        Node fastPtr = head;
        Node intesectPtr = null;
        while(fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if(slowPtr == fastPtr) {
                intesectPtr = slowPtr;
                break;
            }
        }
        if(intesectPtr == null) {
            System.out.println("There is no loop");
            return;
        }
        slowPtr = head;
        Node prevPtr = null;
        while(slowPtr != intesectPtr) {
            slowPtr = slowPtr.next;
            prevPtr = intesectPtr;
            intesectPtr = intesectPtr.next;
        }
        prevPtr.next = null;
    }
}

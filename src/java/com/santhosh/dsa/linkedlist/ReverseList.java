package com.santhosh.dsa.linkedlist;

public class ReverseList {
    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(6);
        head.next.next = new Node(7);
        printList(head);
        Node reversedHead = reverse(head);
        printList(reversedHead);
    }

    private static void printList(Node node) {
        System.out.println(" The contents of list is :");
        while(node != null) {
            System.out.print(node.data+" ");
            node = node.next;
        }
    }

    private static Node reverse(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}

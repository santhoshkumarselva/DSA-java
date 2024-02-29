package com.santhosh.dsa.linkedlist;

public class SumOfNumbers {
    public static void main(String[] args) {
        Node head1 = new Node(2);
        head1.next = new Node(3);
        head1.next.next = new Node(1);
        Node head2 = new Node(1);
        head2.next = new Node(4);
        head2.next.next = new Node(5);
        addBoth(head1, head2);
    }

    private static void addBoth(Node head1, Node head2) {
        int carry = 0, sum = 0;
        Node result = null, currentResult = null;
        while(head1 != null || head2 !=null || carry !=0) {
            sum = carry;
            if(head1 != null) {
                sum += head1.data;
                head1 = head1.next;
            }
            if(head2 != null) {
                sum += head2.data;
                head2 = head2.next;
            }
            carry = sum/10;
            Node newNode = new Node(sum%10);
            if(result != null) {
                currentResult.next = newNode;
                currentResult = currentResult.next;
            }
            else {
                result = newNode;
                currentResult = result;
            }
        }
        printSolution(result);
    }

    private static void printSolution(Node result) {
        while(result != null) {
            System.out.println(result.data);
            result = result.next;
        }
    }
}

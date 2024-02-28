package com.santhosh.dsa.linkedlist;

public class SumOfNumbers {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(2);
        head1.next = new ListNode(3);
        head1.next.next = new ListNode(1);
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(4);
        head2.next.next = new ListNode(5);
        addBoth(head1, head2);
    }

    private static void addBoth(ListNode head1, ListNode head2) {
        int carry = 0, sum = 0;
        ListNode result = null, currentResult = null;
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
            ListNode newNode = new ListNode(sum%10);
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

    private static void printSolution(ListNode result) {
        while(result != null) {
            System.out.println(result.data);
            result = result.next;
        }
    }
}

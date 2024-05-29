package com.santhosh.dsa.tree.misc;

import com.santhosh.dsa.tree.Node;

import java.util.concurrent.atomic.AtomicInteger;

public class SingleValuedSubTree {
    public static int countOfSingleValuedSubTree(Node root) {
        AtomicInteger count = new AtomicInteger(0);
        countOfSingleValuedSubTreeUtils(root, count);
        return count.intValue();
    }

    private static boolean countOfSingleValuedSubTreeUtils(Node root, AtomicInteger count) {
        if(root == null) return true;
        boolean isLeftSubTreeSingleValued = countOfSingleValuedSubTreeUtils(root.left, count);
        boolean isRightSubTreeSingleValued = countOfSingleValuedSubTreeUtils(root.right, count);
        if(isLeftSubTreeSingleValued && isRightSubTreeSingleValued) {
            if(root.left == null) {
                if(root.right == null || root.value == root.right.value) {
                    count.incrementAndGet();
                    return true;
                }
                return false;
            } else if (root.right == null) {
                if(root.value == root.left.value) {
                    count.incrementAndGet();
                    return true;
                }
                return false;
            } else {
                return (root.value == root.left.value) && (root.value == root.right.value);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(1);
        root.right = new Node(5);
        root.left.left = new Node(5);
        root.left.right = new Node(5);
        root.right.right = new Node(5);
        System.out.println(countOfSingleValuedSubTree(root));
    }
}

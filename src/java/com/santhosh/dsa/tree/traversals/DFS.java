package com.santhosh.dsa.tree.traversals;

import com.santhosh.dsa.tree.Node;

public class DFS {
    public static void traverseInOrder(Node root) {
        if(root == null) return;
        traverseInOrder(root.left);
        System.out.print(" " + root.value);
        traverseInOrder(root.right);
    }
    public static void traversePreOrder(Node root) {
        if(root == null) return;
        System.out.print(" "+root.value);
        traversePreOrder(root.left);
        traversePreOrder(root.right);
    }
    public static void traversePostOrder(Node root) {
        if(root == null) return;
        traversePostOrder(root.left);
        traversePostOrder(root.right);
        System.out.print(" "+root.value);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println("InOrder traversal: ");
        traverseInOrder(root);
        System.out.println("\nPreOrder traversal: ");
        traversePreOrder(root);
        System.out.println("\nPostOrder traversal: ");
        traversePostOrder(root);
    }
}

/**  1
    /\
 2       3
/\      /\
4 5 null null **/
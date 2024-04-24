package com.santhosh.dsa.tree;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

class Node {
    Node left, right;
    int value;

    public Node(int value) {
        this.value = value;
    }
}

public class BFS {
    static void traverseBFS(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int n = queue.size();
            Node node = null;
            for (int i=0; i<n; i++) {
                node = queue.poll();
                int val = Objects.requireNonNull(node).value;
                System.out.println(" "+ val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        traverseBFS(root);
    }
}

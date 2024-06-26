package com.santhosh.dsa.tree.traversals;

import com.santhosh.dsa.tree.Node;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class BFS {
    public static void traverseBFS(Node root) {
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
                System.out.print(" "+ val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            System.out.println("\n");
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

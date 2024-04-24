package com.santhosh.dsa.tree.misc;

import com.santhosh.dsa.tree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectNodesAtSameLevel {
    static void connectNodes(Node root) {
        if(root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            Node prevNode = null;
            for (int i = 0; i<n; i++) {
                Node currentNode = queue.poll();
                if(prevNode != null) prevNode.nextRight = currentNode;
                prevNode = currentNode;
                if(currentNode.left != null) queue.add(currentNode.left);
                if(currentNode.right != null) queue.add(currentNode.right);
            }
        }
    }
    static void printNextRightNodes(Node root) {
        if(root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 0; i<n; i++) {
                Node currentNode = queue.poll();
                System.out.print("Value:" + currentNode.value + "->nextValue:" + ((currentNode.nextRight!=null)?currentNode.nextRight.value:null)+ "\t");
                if(currentNode.left != null) queue.add(currentNode.left);
                if(currentNode.right != null) queue.add(currentNode.right);
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);
        root.right.right = new Node(3);
        connectNodes(root);
        printNextRightNodes(root);
    }
}

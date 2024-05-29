package com.santhosh.dsa.tree.misc;

import com.santhosh.dsa.tree.Node;

public class KDistanceNodes {
    public static void findKDistanceNodes(Node root, int target, int k) {
        Node targetNode = findTarget(root, target);
        printNodesAtKDistance(root, targetNode, k);
    }

    private static void printNodesAtKDistance(Node root, Node targetNode, int k) {
        if(root == null) return;
        int distance = findDistance(root, targetNode);
        if(distance == k) System.out.println(root.value);
        printNodesAtKDistance(root.left, targetNode, k);
        printNodesAtKDistance(root.right, targetNode, k);
    }

    private static int findDistance(Node root, Node targetNode) {
        if(root == null || targetNode == null) return -1;
        if(root.value == targetNode.value) return 0;
        int leftDistance, rightDistance;
        leftDistance = findDistance(root.left, targetNode);
        rightDistance = findDistance(root.right, targetNode);
        if(leftDistance >= 0) return leftDistance+1;
        if(rightDistance >= 0) return rightDistance+1;
        return -1;
    }

    private static Node findTarget(Node root, int target) {
        if(root == null) return null;
        if(root.value == target) return root;
        Node leftResult = findTarget(root.left, target);
        Node rightResult = findTarget(root.right, target);
        return (leftResult != null)? leftResult:rightResult;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(7);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);
        root.right.right = new Node(6);
        KDistanceNodes.findKDistanceNodes(root, 2, 1);
    }
}

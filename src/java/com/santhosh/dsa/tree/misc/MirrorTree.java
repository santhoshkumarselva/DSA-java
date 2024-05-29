package com.santhosh.dsa.tree.misc;

import com.santhosh.dsa.tree.Node;
import com.santhosh.dsa.tree.traversals.BFS;

public class MirrorTree {
    public static Node convertToMirror(Node root) {
        if(root == null) return null;
        Node leftNode = convertToMirror(root.left);
        Node rightNode = convertToMirror(root.right);
        root.left = rightNode;
        root.right = leftNode;
        return root;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(7);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);
        root.right.right = new Node(6);
        BFS.traverseBFS(root);
        convertToMirror(root);
        BFS.traverseBFS(root);
    }
}

package com.santhosh.dsa.tree;

public class Node {
    public Node left, right, nextRight;
    public int value;
    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
        this.nextRight = null;
    }
}

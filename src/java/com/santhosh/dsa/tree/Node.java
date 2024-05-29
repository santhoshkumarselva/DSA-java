package com.santhosh.dsa.tree;

public class Node implements Comparable{
    public Node left, right, nextRight;
    public int value;
    public char c;
    public String code;
    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
        this.nextRight = null;
        this.c = ' ';
        this.code = "";
    }
    public Node(char c, int value) {
        this.c = c;
        this.value = value;
    }

    @Override
    public int compareTo(Object o) {
        return this.value - ((Node) o).value;
    }
}

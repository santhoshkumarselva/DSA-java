package com.santhosh.dsa.tree.misc;

import com.santhosh.dsa.tree.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeDiameterTest {
    @Test
    void checkInput1() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        assertEquals(4, TreeDiameter.findDiameter(root));
    }
    @Test
    void checkInput2() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(6);
        root.left.right.right = new Node(7);
        assertEquals(5, TreeDiameter.findDiameter(root));
    }
    @Test
    void checkInput3() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.right = new Node(5);
        root.right.right.right = new Node(6);
        assertEquals(6, TreeDiameter.findDiameter(root));
    }
}
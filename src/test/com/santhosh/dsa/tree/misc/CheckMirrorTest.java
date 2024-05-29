package com.santhosh.dsa.tree.misc;

import com.santhosh.dsa.tree.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckMirrorTest {
    @Test
    void checkSampleInput1() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);
        root.right.right = new Node(3);
        assertTrue(CheckMirror.checkIsMirrorTree(root));
    }
    @Test
    void checkSampleInput2() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.right = new Node(3);
        root.right.right = new Node(3);
    }
}
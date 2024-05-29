package com.santhosh.dsa.tree.misc;

import com.santhosh.dsa.tree.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class IsSubTreeTest {
    @Test
    void checkInput1() {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(2);
        root1.left.left = new Node(3);
        root1.left.right = new Node(4);
        root1.right.left = new Node(4);
        root1.right.right = new Node(3);
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(2);
        root2.left.left = new Node(3);
        root2.left.right = new Node(4);
        root2.right.left = new Node(4);
        root2.right.right = new Node(3);
        assertTrue(IsSubTree.isSubTree(root1, root2));
    }
}
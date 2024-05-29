package com.santhosh.dsa.tree.misc;

import com.santhosh.dsa.tree.Node;

public class IsSubTree {
    public static boolean isSubTree(Node tree1, Node tree2) {
        if(tree2 == null) return true;
        if(tree1 == null) return false;
        if(tree1.value != tree2.value) {
            return isSubTree(tree1.left, tree2) || isSubTree(tree1.right, tree2);
        } else {
            return FindIfIdentical.isIdentical(tree1, tree2);
        }
    }
}

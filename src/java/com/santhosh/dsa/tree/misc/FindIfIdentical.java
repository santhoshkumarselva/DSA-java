package com.santhosh.dsa.tree.misc;

import com.santhosh.dsa.tree.Node;

public class FindIfIdentical {
    public static boolean isIdentical(Node root1, Node root2) {
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;
        if(root1.value != root2.value) return false;
        else {
            return isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
        }
    }
}

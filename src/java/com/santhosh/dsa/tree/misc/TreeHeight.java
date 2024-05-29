package com.santhosh.dsa.tree.misc;

import com.santhosh.dsa.tree.Node;

public class TreeHeight {
    public static int findHeight(Node root) {
        if(root == null) return 0;
        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}

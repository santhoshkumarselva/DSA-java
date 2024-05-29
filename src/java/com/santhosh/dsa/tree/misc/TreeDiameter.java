package com.santhosh.dsa.tree.misc;

import com.santhosh.dsa.tree.Node;

public class TreeDiameter {
    public static int findDiameter(Node root) {
        if(root == null) return 0;
        int diameterTowardsLeft = findDiameter(root.left);
        int diameterTowardsRight = findDiameter(root.right);
        int leftHeight = TreeHeight.findHeight(root.left);
        int rightHeight = TreeHeight.findHeight(root.right);
        return Integer.max(leftHeight + rightHeight + 1, Integer.max(diameterTowardsLeft, diameterTowardsRight));
    }
}

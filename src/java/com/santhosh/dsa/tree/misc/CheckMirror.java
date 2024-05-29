package com.santhosh.dsa.tree.misc;

import com.santhosh.dsa.tree.Node;

public class CheckMirror {
    public static boolean checkIsMirrorTree(Node root) {
        if(root == null) return true;
        return checkIsMirrorTreeHelper(root.left, root.right);
    }

    static boolean checkIsMirrorTreeHelper(Node left, Node right) {
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        if(left.value != right.value) return false;
        else {
            return checkIsMirrorTreeHelper(left.left, right.right) && checkIsMirrorTreeHelper(left.right, right.left);
        }
    }
}

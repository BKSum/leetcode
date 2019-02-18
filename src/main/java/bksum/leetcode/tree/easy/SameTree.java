package bksum.leetcode.tree.easy;

import bksum.leetcode.tree.TreeNode;

/**
 * Problem #100
 */
class SameTree {

    boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null || p.val != q.val ) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

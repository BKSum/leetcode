package bksum.leetcode.tree;

import java.util.List;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int x) {
        val = x;
    }

    public static TreeNode arrayToTree(int[] a1, TreeNode root, int i) {
        if (i < a1.length) {
            root = new TreeNode(a1[i]);
            root.left = arrayToTree(a1, root.left, i*2+1);
            root.right = arrayToTree(a1, root.right, i*2+2);
        }
        return root;
    }

    public static TreeNode arrayToTree(List<Integer> a1, TreeNode root, int i) {
        if (i < a1.size() && a1.get(i)!=null) {
            root = new TreeNode(a1.get(i));
            root.left = arrayToTree(a1, root.left, i*2+1);
            root.right = arrayToTree(a1, root.right, i*2+2);
        }
        return root;
    }
}


package bksum.leetcode.tree.easy;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int x) {
        val = x;
    }

    static TreeNode arrayToTree(int[] a1, TreeNode root, int i) {
        if (i < a1.length) {
            root = new TreeNode(a1[i]);
            root.left = arrayToTree(a1, root.left, i*2+1);
            root.right = arrayToTree(a1, root.right, i*2+2);
        }
        return root;
    }
}


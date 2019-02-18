package bksum.leetcode.tree.easy;

import org.junit.Before;
import org.junit.Test;
import bksum.leetcode.tree.TreeNode;

import static org.junit.Assert.*;

public class SameTreeTest {
    private SameTree st;

    @Before
    public void setUp(){
        st = new SameTree();
    }

    @Test
    public void isSameTree() {
        int[] treeP = {1,2,3};
        int[] treeQ = {1,2,3};
        TreeNode treeNodeP = new TreeNode();
        TreeNode treeNodeQ = new TreeNode();
        treeNodeP = TreeNode.arrayToTree(treeP, treeNodeP, 0);
        treeNodeQ = TreeNode.arrayToTree(treeQ, treeNodeQ, 0);
        assertTrue(st.isSameTree(treeNodeP, treeNodeQ));
    }
}
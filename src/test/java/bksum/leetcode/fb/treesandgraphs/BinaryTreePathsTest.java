package bksum.leetcode.fb.treesandgraphs;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Before;
import org.junit.Test;

import bksum.leetcode.fb.linkedlist.treesandgraphs.BinaryTreePaths;
import bksum.leetcode.fb.linkedlist.treesandgraphs.TreeNode;

public class BinaryTreePathsTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testBinaryTreePaths() {
		BinaryTreePaths btp = new BinaryTreePaths();
		TreeNode root = new TreeNode(1);
		root.setLeft(new TreeNode(2));
		root.getLeft().setRight(new TreeNode(5));
		root.setRight(new TreeNode(3));
		btp.binaryTreePaths(root);
		List<String> l = new ArrayList<String>();
		l.add("1->2->5");
		l.add("1->3");
		assertEquals(btp.binaryTreePaths(root), l);
	}

}

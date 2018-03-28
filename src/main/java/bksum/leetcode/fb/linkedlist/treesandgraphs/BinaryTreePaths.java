/**
 * 
 */
package bksum.leetcode.fb.linkedlist.treesandgraphs;

import java.util.*;

/**
 * @author brand
 *
 */
public class BinaryTreePaths {

    public void preOrderTraversal(TreeNode root, String path, List<String> bPaths) {
    	if(root.left == null && root.right == null) {
    		bPaths.add(path + root.val);
    	}
    	if(root.left!=null) {
    		preOrderTraversal(root.left, path + root.val + "->", bPaths);
    	}
    	if(root.right!=null) {
    		preOrderTraversal(root.right, path + root.val + "->", bPaths);
    	}    	
    }
    
    public List<String> binaryTreePaths(TreeNode root) {
    	List<String> bPaths = new ArrayList<String>();
    	if(root!=null) {
    		preOrderTraversal(root, "", bPaths);
    	}
		return bPaths;
    }
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTreePaths btp = new BinaryTreePaths();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.right = new TreeNode(5);
		root.right = new TreeNode(3);
		
		List<String> paths = btp.binaryTreePaths(root);
		for(int i = 0; i< paths.size(); i++) {
			System.out.println(paths.get(i));
		}

	}

}

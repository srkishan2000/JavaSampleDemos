package com.shan.sample.reference;


public class StrictBinaryTreeCheck {
	
	/*
	 * Strict Binary Tree Check
	 * A binary tree is strict when all nodes have either two or zero child nodes.
	 * Write a method that checks if a binary tree is strict.
	 * TreeNode API methods: node.left() and node.right().
	 */
	
	public static Boolean isStrictTree(TreeNode node) {
		if (node == null) {
		    return true;
		}
		if ((node.left == null && node.right != null) || (node.left != null && node.right == null)) {
		    return false;
		}
		return isStrictTree(node.left) && isStrictTree(node.right);
	}
	
	public static void main(String[] args) {
		

	}

}

/*
class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;	
	public TreeNode(int data){
		this.data = data;
		left = null;
		right = null;
	} 
}*/

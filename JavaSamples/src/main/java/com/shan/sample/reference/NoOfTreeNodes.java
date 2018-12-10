package com.shan.sample.reference;

public class NoOfTreeNodes {
	
	/*
	 * Number Of Tree Nodes
	 * Write a method that returns the number of nodes in a binary tree.
	 * TreeNode API methods: node.left() and node.right().
	 */
	

	public Integer getNumberOfNodes(TreeNode node) {
		if (node == null) {
			  return 0;
			}
		return 1 + getNumberOfNodes(node.left) + getNumberOfNodes(node.right);
	}
	
	public static void main(String[] args) {
		

	}

}

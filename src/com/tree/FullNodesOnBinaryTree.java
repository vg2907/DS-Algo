package com.tree;

public class FullNodesOnBinaryTree {
	public static void main(String[] args) {
		Node testData = Node.testData();

		int height = numberOfNodes(testData);
		System.out.println(height);

	}

	private static int numberOfNodes(Node testData) {
		if (testData == null) {
			return 0;
		}
		
		int count = 0;
		if(testData.left != null && testData.right != null) {
			count =  1 ;
		}
		
		int a = numberOfNodes(testData.left);
		int b = numberOfNodes(testData.right);
		
		return a + b + count;
	}
	
}

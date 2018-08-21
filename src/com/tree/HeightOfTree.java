package com.tree;

public class HeightOfTree {
	public static void main(String[] args) {
		Node testData = Node.testData();

		int height = height(testData);
		System.out.println(height);
		
		

	}

	private static int height(Node testData) {
		if (testData == null) {
			return 0;
		}

		int left = height(testData.left);
		int right = height(testData.right);

		if (left > right) {
			return left + 1; // if height of left subtree is greater take left + 1. 1 here is for root node
		} else {
			return right + 1;
		}
	}
}

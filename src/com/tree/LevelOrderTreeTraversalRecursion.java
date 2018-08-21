package com.tree;

// breadth first traversal  1 2 3 4 5
// this has n exponential 2 complexity because it traverses thru the tree n times for each level
//
//
public class LevelOrderTreeTraversalRecursion {
	public static void main(String[] args) {
		Node testData = Node.testData();

		int height = height(testData);

		for (int i = 0; i <= height; i++) {
			levelOrder(testData, i);
		}

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

	private static void levelOrder(Node testData, int level) {
		if (testData == null) {
			return;
		}

		if (level == 1) {
			System.out.println(testData.key);
		} else {
			levelOrder(testData.left, level - 1);
			levelOrder(testData.right, level - 1);
		}

	}

}

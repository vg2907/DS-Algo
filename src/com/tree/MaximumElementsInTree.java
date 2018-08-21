package com.tree;

public class MaximumElementsInTree {

	public static void main(String[] args) {
		Node testData = Node.testData();

		int height = maxElement(testData);
		System.out.println(height);

	}

	private static int maxElement(Node node) {
		if (node == null) {
			return 0;
		}

		int max = node.key;

		int left = maxElement(node.left);
		int right = maxElement(node.right);

		max = Math.max(left, max);
		max = Math.max(right, max);

		return max;
	}
}
